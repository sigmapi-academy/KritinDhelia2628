package MyArrays.TwoDArray;
import java.util.*;
/**
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDArrayDemo
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[][] arr = {{1,2}, {3, 4}};
        
        int[][] arr1 = new int[3][3];
        long[][] arr2 = new long[3][3];
        char[][] arr3 = new char[3][3];
        String[][] arr4 = new String[3][3];
        
        float[][] arr5 = new float[3][3];
        double[][] arr6 = new double[3][3];
        
        boolean[][] arr7 = new boolean[3][3];
        
        int[][] arr8= {{1,2}, {3}, {4,5,6}, {10},{2,4,6,8}};
        int i, j;
        System.out.print("\fJagged Array:\n");
        System.out.print("\nTechnique-1\n");
        for(i = 0; i < arr8.length; i++, System.out.print("\n")){
            for(j = 0; j < arr8[i].length; j++){
                System.out.print("\t" + arr8[i][j]);
            }
        }
        
        System.out.print("\nTechnique-2\n");
        //For each loop only applicable for Collection (array list. ...) 
        for(int[] x: arr8){
            for(int y : x){
                System.out.print("\t"+y);
            }
            System.out.print("\n");
        }
        
        System.out.print("\nTechnique-3\n");
        //For each loop only applicable for Collection (array list. ...) 
        for(int[] x: arr8){
            for(i=0; i < x.length; i++){
                System.out.print("\t"+x[i]);
            }
            System.out.print("\n");
        }
        
        System.out.print("\nTechnique-4");
        //For each loop only applicable for Collection (array list. ...) 
        for(int[] x: arr8){
            System.out.print("\n"+java.util.Arrays.toString(x));
        }
        
        System.out.print("\nTechnique-5");
        for(i = 0; i < arr8.length; i++){
            System.out.print("\n"+java.util.Arrays.toString(arr8[i]));
        }
    }
}
