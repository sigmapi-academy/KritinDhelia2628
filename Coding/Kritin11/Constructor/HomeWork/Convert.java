package Constructor.HomeWork;
import java.util.*;

/**
 * Write a description of class Convert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Convert
{
    private int n, d, m, y;
    public Convert(){
        n=d=m=y=0;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter day number: ");
        n = sc.nextInt();
        System.out.print("Enter year(yyyy): ");
        y = sc.nextInt();
    }

    public void day_to_date(){
        int i, days_in_month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(y % 400 == 0 ||(y % 100 != 0 && y % 4 == 0)){
            days_in_month[1] = 29;
        }

        for(i = 0;n >= days_in_month[i]; i++){
            n -= days_in_month[i];
            if(i + 1 == 12){
                i = -1;
                y++;
                if(y % 400 == 0 ||(y % 100 != 0 && y % 4 == 0)){
                    days_in_month[1] = 29;
                }
                else{
                    days_in_month[1] = 28;
                }
            }
        }
        if(n == 0){
            d = days_in_month[i-1];
            m = i - 1;
        }
        else{
            d = n;    
            m = i;
        }
    }

    public void display(){

        String months[] = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};

        System.out.print("\n" + months[m]+" "+d+", "+y);
    }

    public static void main(String[] args){
        Convert c = new Convert();
        c.accept();
        c.day_to_date();
        c.display();
    }
}