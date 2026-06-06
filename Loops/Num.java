//Java program to print numbers from 1 to 'n'
import java.util.Scanner;
class Num
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.print("Enter the limit:");
        n=inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
        inp.close();
    }
}