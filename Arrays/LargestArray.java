//Java program to find the largest element in an array
import java.util.Scanner;
class LargestArray
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of elements:\n");
        int n=inp.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of the array:\n");
        for(int i=0;i<n;i++)
            a[i]=inp.nextInt();
        int max=a[0];
        for(int i=1;i<n;i++)
        {
           if(a[i]>max)
            max=a[i];
        }
        System.out.println("The largest number in the array is:"+max);
        inp.close();
    }
}