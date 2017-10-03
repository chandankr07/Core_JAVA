

public class FourDigitPalindrome {

	public static void main(String[] args) {
				
		for(int i =1000; i<=9999; i++){
			
			String input = String.valueOf(i);
			
		//	String input = Integer.toString(i);
			
			if(input.charAt(0)==input.charAt(3) && input.charAt(2)==input.charAt(1))
				System.out.println(input);
			
		}
	}

}
