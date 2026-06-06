//Java program to input 2 numbers and return the sum
import java.util.Scanner;
public class Sum
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number:");
        a=inp.nextInt();
        System.out.print("Enter the second number:");
        b=inp.nextInt();
        System.out.println("The sum of the two numbers is:"+(a+b));
        inp.close();
    }
}