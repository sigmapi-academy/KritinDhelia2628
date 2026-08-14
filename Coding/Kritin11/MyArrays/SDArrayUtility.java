package MyArrays;
import java.util.*;


/**
 * @author (your name)
 * @version (a version number or a date)
 */
public class SDArrayUtility
{
    public static Scanner sc = new Scanner(System.in);
    public static int[] createAndReturnWithValues(int size){
        int A[] = new int[size];
        System.out.print("\nEnter " + size + "elements in []: \n");
        int i;
        for(i = 0; i < size; i++){
            System.out.print("Enter value in ["+i+"]: ");
            A[i] = sc.nextInt();
        }
        return A;
    }
    
    public static void printSDArray(int A[], String msg){
        System.out.print("\n" + msg + "\n[");
        int i;
        for(i = 0; i < A.length - 1; i++){
            System.out.print(A[i]+", ");
        }
        System.out.print(A[i]+"]\n");
    }
}
