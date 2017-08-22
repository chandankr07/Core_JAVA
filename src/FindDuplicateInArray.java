

import java.util.HashSet;


public class FindDuplicateInArray {
	
	/*
	
	public static void main(String[] args) {
	
		Object [] arr = {11,21,34,11,23,54,34};
		
		System.out.println("Duplicate Elements are : ");
		
		HashSet <Object> set = new HashSet<Object>();
		
		for(Object ob:arr){
			if(!set.add(ob)){
				System.out.println(ob);
			}
		}
		
	}
		
}

*/
  
    public static void main(String[] args) 
    {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr","cha","ku", "ku", "xyz", "def"};
 		System.out.println("Duplicate Elements are : ");
 		
 		
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println(strArray[j]);
                }
            }
        }
    }    

}