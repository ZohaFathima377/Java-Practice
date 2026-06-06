//Java program to print the multiplication table for a given number
import java.util.Scanner;
class MultiplicationTable
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n=inp.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(n*i));
        }
        inp.close();
    }
}