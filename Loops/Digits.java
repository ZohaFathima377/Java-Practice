//Java program to count the digits in a number
import java.util.Scanner;
class Digits 
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int n,,s=0;
        System.out.print("Enter a number:");
        n=inp.nextInt();
        int n1=n;
        while(n!=0)
        {
            n%10;
            s=s+1;
            n=n/10;
        }
        System.out.println("The number to digits in "+n1+":"+s);
        inp.close();
    }
}