package loops;
import java.util.Scanner;
public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        // int num1 = n;
        // while(num1 != 0)
        // {
        //     int n1 = num1%10;
        //     System.out.print(n1+"\t"); 
        //     num1 = num1/10;
        // }
        // System.out.println(n);
        int rev=0;
        while(n != 0)
        {
            int lastDigite = n%10;
            rev = (rev*10)+lastDigite;
            n = n/10;
        }
        n = rev;
        System.out.println(n);
        sc.close();
    }
}
