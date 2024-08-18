package patterns;

import java.util.Scanner;

public class invertedRightAngleTrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerb of lines : ");
        int row = sc.nextInt();
        for (int line = 1; line <= row; line++) {
            for (int star = 1; star <= (row - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
