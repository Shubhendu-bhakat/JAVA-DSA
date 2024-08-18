import java.util.Scanner;

public class calculator {
    private static void makeCalculator(char operator, int op1, int op2) {
        switch (operator) {
            case '+':
                System.out.println("performing addition : ");
                System.out.print("sum is : " + (op1 + op2));
                break;
            case '-':
                System.out.println("performing subtraction : ");
                System.out.print("subtraction is : " + (op1 - op2));
                break;
            case '%':
                System.out.println("performing modulo : ");
                System.out.print(" modulo is : " + (op1 % op2));
                break;
            case '/':
                System.out.println("performing divide : ");
                System.out.print("divide  is : " + (op1 / op2));
                break;
            case '*':
                System.out.println("performing multiplication  : ");
                System.out.print("multiplication is : " + (op1 * op2));
                break;
            default:
                System.out.print("Enter a valid operator ! Thanku ");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the oprator : ");
        char operator = sc.next().charAt(0);
        if (operator != '+' && operator != '-' && operator != '%' && operator != '*' && operator != '/') {
            System.out.println("Invalid operator !");
            sc.close();
            return;
        }
        System.out.print("enter the first operand : ");
        int op1 = sc.nextInt();
        System.out.print("Enter the second operand : ");
        int op2 = sc.nextInt();
        makeCalculator(operator, op1, op2);
        sc.close();
    }
}
