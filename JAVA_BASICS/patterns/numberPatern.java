package patterns;

import java.util.Scanner;

public class numberPatern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int row = sc.nextInt();
        for(int line = 1;line<=row;line++)
        {
            for(int number = 1;number<=line;number++)
            {
                System.out.print(number+"\t");
            }
            System.out.println();
        }
    }
}
