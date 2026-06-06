//Java program to find the sum of first N natural numbers
import java.util.Scanner;
class Sum 
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number:");
        int n=inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" natural numbers:"+sum);
        inp.close();
    }
}