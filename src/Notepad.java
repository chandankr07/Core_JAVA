import java.io.IOException;

public class Notepad
{
    public static void main(String args[]) throws IOException
    {
    	try{
        System.out.println(Runtime.getRuntime().freeMemory());
    } 
    	catch(Exception e){
    		e.printStackTrace();
    }
    	
    
    }
}