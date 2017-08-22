
public class Sorting {

   	private static void selection(int[] a) {
			for(int i=0; i<a.length;i++){
				for(int j =i+1; j<a.length; j++){
					if( a[i] > a[j]){
					int	temp = a[i];
						a[i]= a[j];
						a[j] = temp;
					}
				}
			}
		}
    	
    	private static void bubble(int[] a) {
			for(int i =0; i<a.length;i++){
				for(int j =0; j<a.length-i-1; j++){
					if( a[j] > a[j+1]){
						int	temp = a[j];
						a[j]= a[j+1];
						a[j+1] = temp;
					}
				}
			}
		}
		
		private static void Insertion(int[] a) {
			
			for(int i =1; i<a.length;i++){
				for(int j =i; j>0; j--){
					if( a[j-1] > a[j]){
						int temp = a[j-1];
						a[j-1]= a[j];
						a[j] = temp;
					}
				}
			}
		}

		private static void printArray(int[] a) {
				for(int i:a)
					System.out.println(i);
				}	

	public static void main(String [] args){
		
		Sorting so = new Sorting();
		int arr[] = { 0,-1,225, 234, 25, 5, 12, 22, 11};
//		so.printArray(arr);
		so.selection(arr);
		so.Insertion(arr);
		so.bubble(arr);

		System.out.println("\nSorted array is : \n");
		so.printArray(arr);
	
	}

}