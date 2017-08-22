
import java.util.Arrays;

class TrailZero{
	
		public static void main(String []args)
		{
			int arr[] = {12, 0, 7, 0, 8, 0, 3, 8, 9, 5, 7, 0};
			zeroInEnd(arr);
			
		}
		  
		private static void zeroInEnd(int [] a){

			int count=0;
			
			
			// This will calculate the number of non-zero element in Array and place them on front
			for(int i=0;i<a.length;i++){
				
				if(a[i]!=0){
					
					a[count] =a[i];
					
					count++;
					
				}	
			}	
			
			// Now we have total count and non zero count, and till a[count] will have non-zero numbers now after that we will put 0 till the length of array.
			while(count< a.length) {
				
				a[count] = 0;
				count ++;
			}
				
			System.out.println(Arrays.toString(a));
			
		}
	}
