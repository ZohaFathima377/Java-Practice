//Java program to check whether a given number is even or odd
import java.util.Scanner;
class EvenOdd
{
    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.print("Enter a number");
        n=inp.nextInt();
        if(n%2==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");
        inp.close();
    }
}