//Java program to print a pyramid pattern
import java.util.Scanner;
class Pyramid
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        inp.close();
    }
}