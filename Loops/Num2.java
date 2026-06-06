//Java program to print numbers from 'n' to 1
import java.util.Scanner;
class Num2
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.print("Enter the limit:");
        n=inp.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.println(i);
        }
        inp.close();
    }
}