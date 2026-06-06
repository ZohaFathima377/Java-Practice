//Java program to find the reverse of a number
import java.util.Scanner;
class Reverse 
{
    public static void main(String args[])
    {
        Scanner inp= new Scanner(System.in);
        int r,s=0;
        System.out.print("Enter a number:");
        int n=inp.nextInt();
        int n1=n;
        while(n!=0)
        {
            r=n%10;
            s=r+s*10;
            n=n/10;
        }
        System.out.println("The reverse of "+n1+" is "+s);
        inp.close();
    }
}