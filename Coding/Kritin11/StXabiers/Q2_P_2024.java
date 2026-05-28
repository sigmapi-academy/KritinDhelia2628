package StXabiers;
import java.util.*;


/**
 * Write a description of class Q2_P_2024 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2_P_2024
{
    private int Matrix[][];
    private int M, N;
    public static Scanner sc = new Scanner(System.in);
    public Q2_P_2024(int M, int N){
        this.M = M;
        this.N = N;
        Matrix = new int[M][N];
    }
    
    public void input(){
        int i, j;
        for(i = 0; i < M; i++){
            System.out.print("\nENTER ELEMENTS FOR ROW "+(i+1)+": ");
            String value[] = sc.nextLine().split("\\s");
            for(j = 0; j < N; j++){
                Matrix[i][j] = Integer.parseInt(value[j]);
            }
        }
    }
    
    public void display(){
        System.out.print("\nFILLED MATRIX     DECIMAL EQQUIVALENT");
    }
}