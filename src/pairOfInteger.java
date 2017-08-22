

public class pairOfInteger {
	
	public static void main(String []args)
	{
		int arr[] = {4, 6, 5, -10, 8, 5, 20};
		int sum =10;
		findPairs(arr,sum);
	}
	  
	private static void findPairs(int [] a,int n){
		
		int flag=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]+a[j] == n){
					
					System.out.println(a[i]+ " and " +a[j]);
					flag =1;
				}
			}
		}
		
		if(flag!=1)
			System.out.println("No pair available");
	}
}