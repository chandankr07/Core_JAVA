

public class FindMissingNumberInArray{
	
public static void main(String args[]){
	
	int a [] = {1,4,0,3,2, 5, 8, 6};
	
	int length = a.length;
	
	int sum = sumOfNumbers(length);
	
	int addition = sumOfMembers(a);
	
	int missingNumber = sum-addition;
	
	System.out.println("Missing Number is : "+missingNumber);
	
}

private static int sumOfMembers(int[] a) {
	// TODO Auto-generated method stub
	int sum =0;
	
	for (int i=0;i<a.length;i++){
		sum = sum+a[i]; 
	}
	return sum;
}

private static int sumOfNumbers(int length) {
	// TODO Auto-generated method stub
	int sum = length*(length+1)/2;
	return sum;
}	
	
}