
	import java.util.Scanner;
	
public class ConsecutiveIntegerSumSB {
	    


		public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	    
	      /* 
	         * int : 15
	         * 
	         * 22 : 1,2,3,4,5,6,7,8,9,10,11,12,13
	         * 1 2 3 4 5:
	         * 4,5,6 : 15
	         * 7,8   : 15
	//  */
	    		int num, count =0;;
	    		Scanner sc = new Scanner(System.in);
	    		System.out.println("Enter a number");
	    		
	    		num = sc.nextInt();
	    		
	    		System.out.println("Total consecutive integers are : \n ");
	    		
	    		for (int i = 1; i < num; i++) {
	    			StringBuffer sb = new StringBuffer();
	    			int sum = i;
	    			sb.append(i).append(" ");
	    			
	    			for (int j = i + 1; sum < num; j++) {
	    				sb.append(j).append(" ");

	    				sum = sum + j;
	    				if (sum == num) {
		    				System.out.println(sb.toString() );
		    				count++;
	    				}
	    			}
	    		}
	    	System.out.println("\nAnd their count is : "+count);
	    }
	    
	    
	    }
	        