import java.util.Scanner;
//introduction to 2d array and just how to take input ,output ,search and max min finding....

public class intro2d {
    public static boolean search(int a[][], int key) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == key) {
                    System.out.println("Element found at " + i + "," + j);
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("maximum value is " + max);
        System.out.println("The minimum element in the array is  " + min);
        // search(a, 3);
        sc.close();
    }
}