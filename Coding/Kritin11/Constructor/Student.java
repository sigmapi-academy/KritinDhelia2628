package Constructor;

/**
 * Write a description of class q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //Properties are instance variable. 
    private int rollNum;
    private String name;
    
    //Methods are called behaviors. 
    //Parameterized constructor. 
    public Student(int rollNum, String name){
        this.rollNum = rollNum;
        this.name = name;
    }
    
    //Copy Constructor
    public Student(Student st){
        this.rollNum = st.rollNum;
        this.name = st.name;
    }
    
    @Override
    public String toString(){
        return "[rollNum = " + rollNum + ", name = " + name + "]";
    }
    public static void main(String[] args){
        Student st1 = new Student(1, "Raman");
        System.out.print("\fst1: " + st1);
    }
}