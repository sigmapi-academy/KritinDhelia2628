package Loops;



/**
 * Write a description of class Q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q11
{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in); // Object of Scanner class
        int a = -1, b = 1, f, n;
        System.out.print("\fEnter any integer value: ");
        //n = sc.nextInt();
        n = new java.util.Scanner(System.in).nextInt(); //Annonymous object
        for(f = 0; f <= n; a = b, b = f){
            f = a + b;
            if(f == n){
                System.out.print("\n"+ n + " is present in the fibonacci series");
                break;
            }
        }
        if(f > n){
            System.out.print("\n" + n + " is not present in the fibonacci series");
        }
    }
}