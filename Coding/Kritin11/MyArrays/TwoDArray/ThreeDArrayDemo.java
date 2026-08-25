package MyArrays.TwoDArray;
import java.util.*;


/**
 * Write a description of class ThreeDArrayDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreeDArrayDemo
{
    public static void main(String[] args){
        System.out.print("\f");
        Random r = new Random();
        int[][][] arr = new int[2][3][3];
        int i, j, k;
        for(i = 0; i < arr.length; i++){
            System.out.print("\nLayer-"+i+"\n");
            for(j = 0; j < arr[i].length; j++, System.out.print("\n")){
                for(k = 0; k < arr[i][j].length; k++){
                    arr[i][j][k] = r.nextInt(10, 100);
                    System.out.print("\t" + arr[i][j][k] );
                }
            }
        }
    }
}