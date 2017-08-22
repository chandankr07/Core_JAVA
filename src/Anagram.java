
import java.util.HashMap;

public class Anagram {
   public static void main(String args[]){
	   
	   String s1 = "M";
	   String s0 = "";
	   
	   String copyOfS1 = s1.replaceAll("\\s","").toLowerCase();
	   String copyOfS0 = s0.replaceAll("\\s","").toLowerCase();
	   
	   System.out.println(copyOfS0);
	   
	   int flag = 1;
	   
	   if(copyOfS0.length()!=copyOfS1.length())
		   flag=0;
	   else 
	   {
		   
		   HashMap <Character,Integer> map = new HashMap<Character,Integer>();
		   
		   for(int i=0; i<copyOfS0.length();i++){
			   
			   char charaskey = copyOfS0.charAt(i);
			   
			   int charCount=0;

			   if(map.containsKey(charaskey)){
				   
				   charCount = map.get(charaskey);
			   }
			   
			   map.put(charaskey, ++charCount);
			   
			   charaskey = copyOfS1.charAt(i);
			   
			   charCount =0;
			   
			   if(map.containsKey(charaskey)){
				   
				   charCount = map.get(charaskey);
			   }
			   
			   map.put(charaskey, --charCount);
			   		   
		   }
		   
		   for(int value :map.values()){
			   
			   if(value!=0)
				   flag=0;
		   }
		}
	   
	   if(flag==1)
		   System.out.println("It's Anagram ");
	   else
		   System.out.println("It's Not an anagram");
	}
}