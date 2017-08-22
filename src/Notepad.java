import java.io.IOException;

public class Notepad
{
    public static void main(String args[]) throws IOException
    {
    	try{
        Runtime.getRuntime().exec("Notepad.exe");
    } 
    	catch(IOException e){
    		e.printStackTrace();
    }
    	
    
    }
}