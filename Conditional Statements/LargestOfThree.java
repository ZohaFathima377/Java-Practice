//Java program to find the largest of three numbers
import java.util.Scanner;
class LargestOfThree
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter three numbers:");
        x=inp.nextInt();
        y=inp.nextInt();
        z=inp.nextInt();
        if(x>y)
        {
            if(x>z)
            {
                System.out.println(x+" is the largest");
            }
            else
            {
                System.out.println(z+"is the largest");
            }
        }
        else
        {
            if(y>z)
            {
                System.out.println(y+" is the largest");
            }
            else
            {
                System.out.println(z+"is the largest");
            }
        }
        inp.close();
    }
}