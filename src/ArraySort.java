

import java.util.Arrays;
import java.util.Collections;

	 public class ArraySort {
	    public static void main(String[] args)
	    {
	    	int a [] = {45, -1, 78, 34, 89, 21,2};
	    

	        
	        Arrays.sort(a);
	        System.out.println("Sorted array : "+Arrays.toString(a));	        
	        
	        
	        
	        Integer [] b = new Integer[]{45, 12, 78, 34, 89, 21};
	        
	        Arrays.sort(b, Collections.reverseOrder());
	        System.out.println("Sorted in reverse order : "+Arrays.toString(b));
	         
	        //Output : [12, 21, 34, 45, 78, 89]
	    }
	}