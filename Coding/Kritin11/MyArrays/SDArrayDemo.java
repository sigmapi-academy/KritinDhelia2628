package MyArrays;
import java.util.*;


/**
 * @author (your name)
 * @version (a version number or a date)
 */
public class SDArrayDemo
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\f");
        int[] Arr1, i; //all the variable will become an array
        int []Arr2, j; //all the variable will become an array
        int Arr3[], k; //all the variables will not become an array
        Arr1 = new int[5];
        Arr2 = new int[5];
        Arr3 = new int[5];
        
        // i = 0;// this type of assgnment is not allowed in the array
        // j = 0; //j is an array
        k = 0;
        //Declaring and allocating memory for the array. 
        int Arr4[] = new int[5];
        
        Arr1[0] = 10;
        Arr1[1] = 20;
        Arr1[2] = 30;
        Arr1[3] = 40;
        Arr1[4] = 50;
        System.out.print("\nArr1[");
        for(k = 0; k < Arr1.length - 1; k++){
            System.out.print(Arr1[k]+", ");
        }
        System.out.print(Arr1[k]+"]\n");
        
        String []month =  {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
            "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.print("\nMonths: ");
        for(String m : month){ //for each loop is mainly used for Arrays and Collection
            System.out.print(m+" ");
        }
        System.out.print("\n");
        
        SDArrayUtility.printSDArray(new int[]{100,200,300,400}, "Anonymous Array[]: ");
        
        //Don't use in school examination
        System.out.print("\nArr1: " + java.util.Arrays.toString(Arr1));
        
        System.out.print("\nEnter number of elements: ");
        int A[] = SDArrayUtility.createAndReturnWithValues(sc.nextInt());
        SDArrayUtility.printSDArray(A, "A[]: ");
    }
}
