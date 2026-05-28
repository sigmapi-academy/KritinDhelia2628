package Loops;

/**
 * Write a description of class Q17a here.
 * S = 9 + 99 + 8 + 89 + 7 + 79 + ... + (upto n terms)
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q17a
{
    /**
     * @param n represents number of terms
     */
    public void seriesSum(int n){
        int sum = 0;
        int Od = 9, ev = 99, start;
        System.out.print("\nS = ");
        for(start = 1; start < n; start++){
            if(start % 2 != 0){
                sum += Od;
                System.out.print(Od + " + ");
                Od--;
            }
            else{
                sum += ev;
                System.out.print(ev + " + ");
                ev-=10;
            }
        }
        if(start % 2 != 0){
            sum += Od;
            System.out.print(Od + " = " + sum);
        }
        else{
            sum += ev;
            System.out.print(ev + " = " + sum);
        }
    }
    
    public static void main(String[] args){
        Q17a ob = new Q17a();
        System.out.print("\fEnter number of terms: ");
        ob.seriesSum(new java.util.Scanner(System.in).nextInt());
    }
}