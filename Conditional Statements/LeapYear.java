//Java program to check whether a year is leap year or not
import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=inp.nextInt();
        if((year%400==0)||(year%4==0 && year%100!=0))
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
        inp.close();
    }
}