package Constructor.HomeWork;
import java.util.*;


/**
 * Write a demo program that creates several books using different constructors and prints all information.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookStore
{
    public static void main(String[] args){
        Book bk1 = new Book("Java", "Pandey", 200);
        Book bk2 = new Book("Maths", "M L Agarwal");
        Book bk3 = new Book(); //calling default constructor
        
        System.out.print("\fNumber of Book objects: " + Book.numberOfBooks());
        bk3.input("Physic", "H C Verma", 600);
        bk2.setPrice(560);
        bk1.display();
        bk2.display();
        bk3.display();
        
        Book bkArr[] = new Book[3];
        int i;
        Scanner sc = new Scanner(System.in);
        
        for(i = 0; i < bkArr.length; i++){
            //allocating memory for each object stored in the array
            System.out.print("\nEnter title: ");
            String t = sc.nextLine();
            System.out.print("Enter author name: ");
            String a = sc.nextLine();
            System.out.print("Price: \u20b9");
            double p = sc.nextDouble();
            sc.nextLine(); //to remove keyboard buffer
            bkArr[i] = new Book(t,a,p);
        }
        
        for(i = 0; i < bkArr.length; i++){
            System.out.print("\n" + bkArr[i]); //it will print the references of each object;
            bkArr[i].display(); //it will display the information of each object
        }
        
        System.out.print("\nNumber of Book objects: " + Book.numberOfBooks());
    }
}