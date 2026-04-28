package Loops;


/**
 * A prime number is said to be Twisted Prime", if the new number obtained
 * reversing the digts is also a prime number. 
 * Write a program to accept a number and check whether the number
 * is 'Twisted Prime' or not. 
 * Sample Input: 167 
 * Sample Output: 761 
 * 167 is a Twisted Prime. 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q12
{
    public boolean isPrime(int x){
        if(x > 2 && (x % 2 == 0) || x == 1){
            return false;
        }
        int d;
        for(d = 3; d <= Math.sqrt(x); d += 2){
            if (x % d == 0){
                return false;
            }
        }
        return true;
    }
    
    public int reverse(int x){
        int n = 0;
        for(;x>0; n = n * 10 + x % 10, x /=10);
        return n;
    }
    
    public boolean isTwistedPrime(int x){
        return isPrime(x) && isPrime(reverse(x));
    }
    
    public static void main(String[] args){
        System.out.print("\fEnter any integer value: ");
        int n = new java.util.Scanner(System.in).nextInt();
        Q12 ob = new Q12();
        
        if(ob.isTwistedPrime(n)){
            System.out.print("\n" + n + " is twisted prime.");
        }
        else{
            System.out.print("\n" + n + " is not twisted prime.");
        }
    }
}