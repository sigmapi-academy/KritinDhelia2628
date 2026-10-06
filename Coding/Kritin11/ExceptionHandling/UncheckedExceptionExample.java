package ExceptionHandling;
import java.util.*;

/**
 * Write a description of class UncheckedExceptionExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UncheckedExceptionExample
{
    public static void main(String[] args){
        String str = null;
        //String str = ""; is not null
        try{
            System.out.println("\nLength of String str: " + str.length());
        }
        catch(NullPointerException npe){
            System.err.println("\nString value is null.");
        }

        int A[] = {1,2,3};
        try{
            System.out.print("\nA[5]: " + A[5]);
        }
        catch(ArrayIndexOutOfBoundsException aiob){
            System.err.println("\nArray index is invalid");
        }

        int r, t, s;
        System.out.print("\nEnter two numbers: ");
        Scanner sc = new Scanner(System.in);
        try{
            t = sc.nextInt();
            s = sc.nextInt();
            try{
                r = t/s;
                System.out.print("\nQuotient: " + r);
            }
            catch(ArithmeticException ae){
                System.err.println("\nDivisor cannot be 0");
            }
        }
        catch(InputMismatchException e){
            System.err.println("\nPlease enter integer value.");
        }

    }
}