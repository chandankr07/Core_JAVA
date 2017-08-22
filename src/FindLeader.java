

public class FindLeader 

{
	public static void main(String []args)
	{
		int arr[] = {21, 58, 44, 14, 51, 36, 23};
		findLeaders(arr);
		
		// Test
		
	}
	  
	private static void findLeaders(int [] a){
		
		System.out.println("Leaders are : ");
		System.out.println(a[a.length-1]);
		
		for(int i=a.length-1;i>0; i--){
			if(a[i]<a[i-1])
			System.out.println(a[i-1]);
		    
		}
		
	}
}
