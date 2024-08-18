package patterns;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of colums : ");
        int col = sc.nextInt();
        System.out.println("enter the no of rows : ");
        int row = sc.nextInt();
        for(int i = 1;i<=col;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");
        sc.close();
    }
}
