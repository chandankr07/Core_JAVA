import java.util.Scanner;

public class ConsecutiveIntegerSum {

	public static void main(String[] args) {

		System.out.println("Please enter the number : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
        int sum=0,c=0,j=0;
        for(int i=1;i<n;i++)
        {
            sum=i;
            j=i+1;

/* adding consecutive natural numbers till sum is less than the given number */

            while(sum<n)
            {
                sum=sum+j;
                j++;
            }

/* when the above while condition is false, then either the sum is equal to
that number or is greater than that number 
So, we will be printing the series of consecutive numbers only if the sum is
equal to that number
Note: variable 'i' is keeping record of the first number of the series and
variable 'j' is keeping record of the last number of the series */

                if(sum==n)
                {
                	c++;
                    for(int k=i;k<j;k++)
                    {
                        if(k==i)
                            System.out.print( c + "-> "+k);
                        else
                            System.out.print("  "+k);
                    }
                 System.out.println();
                }
        }System.out.println("\nCount is :  "+c);
    }
}