import java.util.Scanner;

public class sumOfNaturlnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which sum is to be printed : ");
        int n = sc.nextInt();
        int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum = sum + i;
        //     i++;
        // }
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }

        System.out.println("sum is : " + sum);
        sc.close();
    }
}
