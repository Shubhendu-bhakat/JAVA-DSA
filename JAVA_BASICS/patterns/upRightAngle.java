package patterns;

import java.util.Scanner;

public class upRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        for(int line=1;line<=row;line++){
            for(int star=1;star<=line;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
