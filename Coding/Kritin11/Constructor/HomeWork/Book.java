package Constructor.HomeWork;
import java.util.*;

/**
 *     1. Custom Constructors & Object TrackingCreate a class Book that stores title, author, price, and a unique book ID 
 *     auto‑generated for each new object.
 *     Requirements:
 *     • Implement multiple constructors: default, one with title+author, and one with all fields.
 *     • Maintain a static counter that increments for each book created.
 *     • Add a method applyDiscount(double percent).
 *     • Write a demo program that creates several books using different constructors and prints all information.

 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title, author;
    private double price;
    private int bookId;
    private static int count = 0;
    //parameterized constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookId = count + (count+1) * new java.util.Random().nextInt(1, 100);
        count++;
    }
    //parametrized constructor
    public Book(String title, String author){
        this(title,author, 0);
    }
    //Default constructor
    public Book(){
        this("", "");
    }

    public double applyDiscount(double percent){
        return price * percent;
    }

    public void input(String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public void display(){
        System.out.print("\n------Book Information-----\n"+
            "Title: " + title + "\n"+
            "Author: " + author + "\n" +
            "Price: \u20b9"+price+"\n"+
            "\nBook ID: " + bookId+"\n");
    }

    public static int numberOfBooks(){
        return count;
    }
}