//Java program to calculate the sum of elements in an array
import java.util.Scanner;
class SumOfArray
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=inp.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            a[i]=inp.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of the elements:"+sum);
        inp.close();
    }
}