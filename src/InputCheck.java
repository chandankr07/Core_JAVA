

public class InputCheck
{
    public static void main(String[] args) throws Exception
    {
        
    	String input = "1234567e";
 
    	try{
    		
    		System.out.println(Integer.parseInt(input));
    	}
    	
    	catch (Exception e){
    		System.out.println("Error");
    	}
    	
    }
}