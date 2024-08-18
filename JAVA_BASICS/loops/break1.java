package loops;

import java.util.Scanner;

public class break1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("number is " + n);
        }
        System.out.println("loop terminated");
        sc.close();
    }
}
