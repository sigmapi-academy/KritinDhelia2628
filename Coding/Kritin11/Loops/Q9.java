package Loops;
import java.util.*;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num, nn="";
        int i;
        System.out.print("\fEnter any number: ");
        num = sc.next();
        for(i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            if(c != '0'){
                nn = nn + c;
            }
        }
        System.out.print("\nNew number after removing zeros: " + nn );
    }
}