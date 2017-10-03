

public class StringHLO {

	
	public static void main(String []args){
		
		String input = "Hello World!";
		
		String s= "eLO";
		
		int flag =0; 
		
		int first = 0, second=0;

		input = input.toLowerCase();
		
		for(int i=0; i<s.length();i++){
			
			
			first = second;
			
			String s1 = Character.toString(s.toLowerCase().charAt(i));

			if(!input.contains(s1))
				flag=1;	
				
			if(input.contains(s1)){
				second = input.indexOf(s1);
			}
			
			if(first>second)
				flag =1;
			
		}
		
		if(flag==0)
			System.out.println(true);
		else
			System.out.println(false);
		
	}
}
