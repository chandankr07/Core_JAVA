
public class Triangle
{
    public static void main(String[] args)
    {
        String s = "JAVAJ2EE";
 
        char[] c = s.toCharArray();
 
        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(c[j]+" ");
            }
            System.out.println(); //This is a new Line
        }
    }
}