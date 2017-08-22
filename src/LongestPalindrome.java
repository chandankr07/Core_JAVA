public class LongestPalindrome{
	public static void main(String [] args){
	
		longestPalSubstr("forgeeksskeegfor");
	}
	private static void longestPalSubstr(String input){
		
			int	maxLength = 1;

			int start = 0;
			int length = input.length();

			int low = 0;
			int high = 0;
			char str []= 	input.toCharArray();			
				for(int i=1;i<length;i++){
				low = i - 1;
				high = i;
				
				while (low >= 0 && high < length && str[low] == str[high]){
					System.out.println("I am here");
				  if (high - low + 1 > maxLength){
					  System.out.println("I am here 0");
						start = low;
						maxLength = high - low + 1;
				  }
				low += 1;
				high -= 1;
				}
				low = i - 1;
				high = i + 1;
				
				while (low >= 0 && high < length && str[low] == str[high]){
					System.out.println("I am here 1");
				if (high - low + 1 > maxLength){
					System.out.println("I am here 2");
					start = low;
					maxLength = high - low + 1;
				}
				
				low += 1;
				high -= 1;

			}
			
			}
				System.out.println("Maximum length of the substring is : " +maxLength + " and palindrome is :" );
				
	}
	
}