	import java.util.LinkedHashSet;
	
	public class RemoveDuplicateFromArray{
		
		public static void main(String args[]){
			
			
			Object arr [] = {"chandan","is","chandan","so","what",15, 21, 11, 21, 51, 21, 11, "i","can","do","what","you","cannot","do","am","i","right","so","what"}; 

	//		Object arr [] = {15, 21, 11, 21, 51, 21, 11};
		
			LinkedHashSet<Object> set = new LinkedHashSet<Object>(); 

			for(int i=0; i<arr.length;i++)
				set.add(arr[i]);
					
			Object[] result = set.toArray();
			
			System.out.println("Final Array will be :  ");
			
			for(Object st: result)
				System.out.println(st);
		}
	}