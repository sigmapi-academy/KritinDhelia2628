package Loops;


/**
 * Write a description of class t here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;


public class NUMBERS
{
    public static void main()

    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 no.s such that m is between 100 and 10000 and n is less then 100");

        int m = sc.nextInt();

        int n = sc.nextInt();

        int ch = 0, f=m, sum=0;

        if(m<100 || m>10000 || n>100)

            System.out.println("Invalid input");

        else

        {

            while(ch==0)

            {

                sum=0;

                while(f>0)

                {

                    sum+=f%10;

                    f/=10;

                }

                if(sum==n)

                    ch=1;

                else

                    m++;

            }

            System.out.println(m);

        }

    }

}
 
