package MyArrays;
import java.util.*;


/**
 * Write a description of class Mixarray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mixarray
{
    private int arr[], cap;
    
    private static Scanner sc = new Scanner(System.in);
    public Mixarray(int mm){
        cap = mm;
        arr = new int[cap];
    }
    
    public void input(){
        int i;
        for(i = 0; i < cap; i++){
            System.out.print("Enter integer value in [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }
    
    public Mixarray mix(Mixarray P, Mixarray Q){
        int i, j, np, nq;
        
        if(P.cap >= 3){
            np = 3;
        }
        else{
            np = P.cap;
        }
        if(Q.cap >= 3){
            nq = 3;
        }
        else{
            nq = Q.cap;
        }
        
        Mixarray m = new Mixarray(np+nq);
        
        for(i = 0; i < np; i++){
            m.arr[i] = P.arr[i]; 
        }
        
        for(i = 0 ; i < nq; i++){
            m.arr[i+np] = Q.arr[i]; 
        }
        return m;
    }
    
    public void display(){
        System.out.print("{");
        int i;
        for(i = 0; i < cap - 1; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[i]+"}\n");
    }
    
    public static void main(String[] args){
        Mixarray A, B, C;
        System.out.print("\fEnter number of elements in A: ");
        A = new Mixarray(sc.nextInt());
        System.out.print("Enter number of elements in B: ");
        B = new Mixarray(sc.nextInt());
        C = new Mixarray(6);
        System.out.print("Enter values in first array: \n");
        A.input();
        System.out.print("Enter values in second array: \n");
        B.input();
        C = C.mix(A, B);
        System.out.print("\nArray1: ");
        A.display();
        System.out.print("\nArray2: ");
        B.display();
        System.out.print("\nResultant Array: ");
        C.display();
    }
}