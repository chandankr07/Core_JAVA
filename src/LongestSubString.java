
import java.util.LinkedHashMap;


public class LongestSubString {

		public static void main(String []args)
		{
			String s1= "javaconceptoftheday";
			longestSubString(s1);
		}
		
		private static void longestSubString(String input){
			
			int len=0;
			String longestst= null;
			
			if (input.length()==0)
				System.out.println("Please enter a valid String");
			
			
			// we are using here a linked haskmap because it returns value as entered in the Map. HashMap ordering will be different.
			LinkedHashMap <Character, Integer > map = new LinkedHashMap <Character,Integer> ();
			
			for(int i=0; i<input.length(); i++){
				
				char ch= input.charAt(i);
				
				if(!map.containsKey(ch)){
					map.put(ch, i);
				}
				else {
					i= map.get(ch);
					System.out.println("Value of i  : "+i);
					map.clear();
				}
				
				if(map.size() > len){
					len=map.size();
					longestst = map.keySet().toString();
					System.out.println("here : "+longestst);
				}
			}
			
			System.out.println("Longet Substring is : "+longestst );
			System.out.println("\nSize is "+len);
		}	
	}
