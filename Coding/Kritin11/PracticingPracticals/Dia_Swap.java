package PracticingPracticals;


/**
 * Write a description of class q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
class Dia_Swap
{
    static Scanner sc = new Scanner(System.in);
    int arr[][], size;
    Dia_Swap(int x)
    {
        size = x;
        arr= new int[x][x];
    }
    void swap()
    {
        int k = 0;
        for(int i = 0;i<size;i++)
        {
            k = arr[i][i];
            arr[i][i] = arr[i][size-1-i];
            arr[i][size-1-i] = k;
        }
    }
    void input()
    {
        System.out.println("enter array elements");
        for(int i = 0;i<size;i++)
        {
            for(int j = 0;j<size;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for(int i = 0;i<size;i++)
        {
            for(int j = 0;j<size;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        System.out.println("enter array size");
        int n = sc.nextInt();
        Dia_Swap obj = new Dia_Swap(n);
        obj.input();
        obj.display(); //before swapping
        obj.swap();
        obj.display(); //after swapping
    }
}