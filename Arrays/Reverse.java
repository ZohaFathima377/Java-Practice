//Java program to reverse an array
import java.util.Scanner;
class Reverse
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
        System.out.println("Reversed array:");
        for(int i=n-1;i>=0;i--)
            System.out.print(a[i]+" ");
        inp.close();
    }
}