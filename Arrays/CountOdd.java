//Java program to count the number of odd numbers in an array
import java.util.Scanner;
class CountOdd
{
    public static void main(String []args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=inp.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            a[i]=inp.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
                count++;
        }
        System.out.println("The number of odd numbers in the array:"+count);
        inp.close();
    }
}