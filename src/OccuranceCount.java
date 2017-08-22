
import java.util.HashMap;
import java.util.Map.Entry;


public class OccuranceCount {
	  
		public static void main(String[] args)  {
			String s1= "java concept of theday";
			occrcount(s1);
		}
		
		public static void occrcount(String s){
			
			HashMap<Character,Integer> map= new HashMap<Character, Integer>();
			
			for(int i=0; i<s.length();i++){
				
				char charKey = s.charAt(i);
				int count =0;
				
				if(map.containsKey(charKey))
					count = map.get(charKey);
				
				map.put(charKey, ++count);
				
			}
						
			for(Entry<Character, Integer> entry:map.entrySet())
				System.out.println(entry.getKey() + " : " +entry.getValue() );

		
			System.out.println("\nDuplicate elements are : ");
			
			for(Entry<Character, Integer> entry:map.entrySet()){
				if(entry.getValue()>=2)	
					System.out.println(entry.getKey());
			}
		}		
	}