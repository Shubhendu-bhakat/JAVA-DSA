import java.util.Scanner;

public class sumOfTwoNumber{
    public static void main(String[] args) {
        System.out.println("hello world ");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number 1 : ");
            int num = sc.nextInt();
            System.out.print("enter the number 2 : ");
            int num2 = sc.nextInt();
            int sum = num + num2;
            System.out.println("sum is : " + sum);
        }
        
    }
}