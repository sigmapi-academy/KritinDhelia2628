package MyArrays;

/**
 * Write a description of class x here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

class fill_fibo {
    private int[][] arr;   // 2D array to store Fibonacci numbers
    private int m;         // number of rows
    private int n;         // number of columns

    // Constructor to initialize matrix size
    public fill_fibo(int r, int c) {
        m = r;
        n = c;
        arr = new int[m][n];
    }

    // Method to check if a number is Fibonacci
    public int isFibonacci(int p) {
        int a = 0, b = 1;
        if (p == 0 || p == 1) return 1;
        int c = a + b;
        while (c <= p) {
            if (c == p) return 1;
            a = b;
            b = c;
            c = a + b;
        }
        return 0;
    }

    // Method to fill the matrix with first m*n Fibonacci numbers row-wise
    public void fill() {
        int a = -1, b = 1, c;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c = a + b;
                arr[i][j] = c;
                a = b;
                b = c;
            }
        }
    }

    // Method to display the matrix
    public void display() {
        System.out.println("Fibonacci Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main function to test the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        fill_fibo obj = new fill_fibo(r, c);
        obj.fill();
        obj.display();

        // Example check for isFibonacci
        System.out.print("Enter a number to check if it is Fibonacci: ");
        int num = sc.nextInt();
        if (obj.isFibonacci(num) == 1)
            System.out.println(num + " is a Fibonacci number.");
        else
            System.out.println(num + " is NOT a Fibonacci number.");
    }
}