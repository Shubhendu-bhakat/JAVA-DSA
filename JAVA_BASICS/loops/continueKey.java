package loops;

import java.util.Scanner;

public class continueKey {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
                int a = sc.nextInt();
                if(a%10 == 0)
                {
                    continue;
                }
                else
                {
                    System.out.println("number is : "+a);
                }
            
        }
    }
}
