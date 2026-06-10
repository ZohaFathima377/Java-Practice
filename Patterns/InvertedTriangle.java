//Java program to print an inverted triangle pattern
import java.util.Scanner;
class InvertedTriangle
{
    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=inp.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        inp.close();
    }
}