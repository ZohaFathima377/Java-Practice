//Program to calculate simple interest
import java.util.Scanner;
class SimpleInterest
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        double p,si;
        int t,r;
        System.out.print("Enter the principle amount:");
        p=inp.nextInt();
        System.out.print("Enter the time(in yrs):");
        t=inp.nextInt();
        System.out.print("Enter the rate of interest:");
        r=inp.nextInt();
        si=(p*t*r)/100;
        System.out.println("Principle Amount:"+p+"\nTime:"+t+"\nRate of interest:"+r+"\nSimple Interest:"+si);
        inp.close();
    }
}