

public class Palindrome {
	
	public static void main(String args[]){
			
		String input = "mawwam";
		
		int len = input.length();
		
/*		String rev ="";
		
		for(int i=len-1;i>=0;i--){
			rev = rev + input.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equals(input))
			System.out.println("It's Palindrome");
		else 
			System.out.println("it's not");
		*/
		
		
		if(len<=0)
			System.out.println("Please enter a valid String");
			
		else {	
		
				int flag=0;
				
				for (int i=0; i<len/2; i++){
					flag=0;
					if(input.charAt(i)==input.charAt(len-1-i)){
						flag=1;
					}
				}
				
				if(flag==1)
						System.out.println("Its Palindrome");
				else
					System.out.println("It's not palindrome");
			}	
		
/*	
 * 
 * String reverse using recursion
 * 	
 * public static String reverse(String input){ 
			if(input == null || input.isEmpty())
				{
					return input; 
				} 
			return 
					input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1)); } 
		
		
*/		
		
		/*
		 * Using recursion
		
		public static boolean isPalindrome(String in){
			   if(in.equals(" ") || in.length() < 2 ) return true;
			   if(in.charAt(0).equalsIgnoreCase(in.charAt(in.length-1))
			      return isPalindrome(in.substring(1,in.length-2));
			   else
			      return false;
			 }
		
		*/
		
		
/*		StringBuffer rev = new StringBuffer(str).reverse();
		
		if(str.equals(rev.toString()))
			System.out.println("It's Palindrome");
		else
			System.out.println("It's not palindrome");
*/	
	

		int r,sum=0,temp;    
	
		int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		
	
	}

}
