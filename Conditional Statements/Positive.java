//Java program to check if a number is positive or negative
import java.util.Scanner;
class Positive
{
    public static void main(String []args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=inp.nextInt();
        if(n==0)
            System.out.println("Neither positive nor negatice");
        else if(n>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
        inp.close();
    }
}