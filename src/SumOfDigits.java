
public class SumOfDigits {

	public static void main(String[] args)
    {
       int input = 1234812348;
    	int sum =0;
    	
    	while(input>0){
    		int temp=input%10;
    		input=input/10;
    		sum=sum+temp;
    	}

    	System.out.println(sum);
    	
    }
}

