

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] input = {12,14,5,45,65,34,67,46,52,57,56,23};
		
		
		int largest,secondlargest;
		
		if(input[0]>input[1])
		{
			largest = input[0];
			secondlargest = input[1];
		}
		else 
		{
			largest = input[1];
			secondlargest = input[0];
		}
		for (int i=2;i<input.length;i++)
		{
			if( input[i] >largest){
				secondlargest=largest;
				largest=input[i];
		}
		    else if (input [i] < largest && secondlargest < input[i] ){
				secondlargest =input[i];
			}
		}
			System.out.println(secondlargest);
	}
	
}
