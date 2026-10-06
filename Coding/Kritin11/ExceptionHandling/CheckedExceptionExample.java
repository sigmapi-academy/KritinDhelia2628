package ExceptionHandling;
import java.io.*;

/**
 * Write a description of class CheckedExceptionExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckedExceptionExample
{
    public static void main(String[] args){
        try{
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            fr.close();
        }
        catch(FileNotFoundException ob){
            System.out.print("\nFile nahi mila");
        }
        catch(IOException ob){
            System.out.print("\nFile read error");
        }
    }
}