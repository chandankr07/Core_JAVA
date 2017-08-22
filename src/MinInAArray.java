

public class MinInAArray {
	public static void main(String args[]){
		
		int arr[] = {21,32,43,23,32,51,41,3};
		minima(arr);
	}

	private static void minima(int[] arr) {
		// TODO Auto-generated method stub
		
		int minimum = arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]< minimum)
				minimum =arr[i];
		}
			System.out.println(minimum);
	}
}