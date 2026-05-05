package Loops;
import java.util.*;

/**
 * Write a description of class Q9UsingInt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9UsingInt
{
    //instance variables
    private int num, newNum;
    //parametrized constructor
    public Q9UsingInt(int num){
        this.num = num;
    }
    
    public int reverse(int n){
        int rev = 0;
        for(;n > 0; rev = rev * 10 + n % 10, n /= 10);
        return rev;
    }

    public int removeZero(int n){
        int digit, newNum = 0;
        for(;n > 0; n /= 10){
            digit = n % 10;
            if(digit > 0){
                newNum = newNum * 10 + digit;
            }
        }
        return reverse(newNum);
    }

    public void display(){
        newNum = removeZero(num);
        System.out.print("\nOriginal number: " + num +
            "\nAfter removing zeros: " + newNum);
    }

    public static void main(String[] args){
        System.out.print("\fEnter any integer value: ");
        int n = new Scanner(System.in).nextInt();
        Q9UsingInt ob = new Q9UsingInt(n);
        ob.display();
    }
}