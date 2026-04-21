package Loops;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    String name; //field
    
    static String City;
    Person(){ //Constructor
        name = null;
        System.out.print("\nObject created");
    }
    
    void setName(String nm){
        name = nm;
    }
    
    String getName(){
        return name;
    }
    
    static{
        //System.out.print("\nThis is pure static block");
        City = "Kolkata";
        //This block is used to initialize the static variables only.
    }
    
    {
        System.out.print("\fThis is a person class");
        //This block will execute whenever we create object of the class.
    }
    
    
}