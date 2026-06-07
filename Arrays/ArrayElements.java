//Java program to accept and print array elements
import java.util.Scanner;
class ArrayElements
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=inp.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
            arr[i]=inp.nextInt();
        System.out.println("Array elements:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        inp.close();
    }
}