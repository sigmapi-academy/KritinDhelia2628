package Loops;


/**
 * Write a description of class Coverersion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coverersion
{
    public static void convertIntegerToBinary(int v){
        System.out.print("\nBinary equivalent of " + v +" is: " +
        Integer.toBinaryString(v));
        System.out.print("\n?: "+Integer.toUnsignedString(110, 2));
        System.out.print("\n ??: "+Integer.toString(1101, 16));    
    }
}