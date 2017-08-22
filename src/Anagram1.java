

import java.util.HashMap;
import java.util.Iterator;

import java.util.*;

public class Anagram1 {

	public static void main(String []args){
		
		System.out.println(isAnagram("cha","ach"));
	}
	
	
	public static boolean isAnagram(String s1,String s2){
		
		s1= s1.replaceAll("\\s", "").toLowerCase();
		s2= s2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length()!=s2.length())
			return false;
		
		
		for(int i=0; i<s1.length();i++){
			
				char c = s1.charAt(i);
				
				int index = s2.indexOf(c);
				
				s2 = new StringBuilder(s2).deleteCharAt(index).toString();
			}
			if(s2.length()==0)
			return true;
		
		
		HashMap <Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<s1.length();i++){
			
			char key = s1.charAt(i);
			int value =0;
			
			if(map.containsKey(key)){
				
				value=map.get(key);
			}
			map.put(key, ++value);
			
			key = s2.charAt(i);
			value =0;
			
			if(map.containsKey(key)){
				
				value=map.get(key);
			}
			
			
			map.put(key, --value);
		}
		for(int value :map.values()){
			   
			   if(value==0)
				   return true; 
		   }
		
	 return false;
	}
	
}
