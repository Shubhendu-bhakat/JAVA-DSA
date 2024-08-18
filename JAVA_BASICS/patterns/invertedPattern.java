package patterns;

import java.util.Scanner;

public class invertedPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter th number of rows : ");
        int row = sc.nextInt();
        for(int lines =1;lines<=row;lines++)
        {
            for(int space =1;space<=row-lines; space++){
                System.out.print(" ");
            }
            for(int number=1; number<=lines;number++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
