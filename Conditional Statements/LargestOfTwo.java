//Java program to find the largest of two numbers'
import java.util.Scanner;
class LargestOfTwo
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int n,m;
        System.out.print("Enter two numbers:");
        n=inp.nextInt();
        m=inp.nextInt();
        if(n>m)
            System.out.println(n+" is larger");
        else
            System.out.println(m+" is larger");
        inp.close();
    }
}