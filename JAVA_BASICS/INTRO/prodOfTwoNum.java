import java.util.Scanner;

public class prodOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter the number 2 : ");
        int num2 = sc.nextInt();
        int product = num1*num2;
        System.out.print("product is : "+product);

    }
}
