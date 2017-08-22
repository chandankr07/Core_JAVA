

public class Fibonacci{
	
	public static void main(String agrs[]){

		int n1=0,n2=1,n3,i,count=10;    
		
		System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			 n3=n1+n2;    
			 
			 System.out.print(" "+n3);    
			 n1=n2;    
			 n2=n3;    
		 }    
	}
}

/*
public class Fibonacci {

    public static int fib(int n) {
        return n < 2 ? n : fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.print(fib(i)+", ");
        }
        System.out.println("...");
    }
}

*/


// using recursion 
/*
class Fibonacci{  
	 
	
	static int n1=0,n2=1,n3=0;    
	public static void main(String args[]){    
		  int count=10;    
		  System.out.print(n1+" "+n2);//printing 0 and 1    
	
		  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
		 } 
	 
	
	static void printFibonacci(int count){    
	    
		if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 
	   
	}  
*/

