

public class Split{  
	public static void main(String args[]){  
		
		String s1="Hi i am chandan";  
		
		String [] arr = s1.split("\\s");
		
		for(String s:arr)
			System.out.println(s);
	
		System.out.println("After Change :");
		
		for(int i=0;i<arr.length;i++){
			//temp.add(arr[arr.length-i-1]);
			arr[i] = new StringBuffer(arr[i]).reverse().toString();
		}
		
		for(String s:arr)
			System.out.println(s);
		
		
		}
	}  