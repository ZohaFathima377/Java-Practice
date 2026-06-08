//Java program to find the smallest number in an array
import java.util.Scanner;
class SmallestArray
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
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("The smallest number in the array is:"+min);
        inp.close();
    }
}