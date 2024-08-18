import java.util.Scanner;

public class factorial {
    private static void fact(int n) {
        int factNumber = 1;
      for(int i =1;i<=n;i++)
      {
         factNumber = factNumber*i;
      }
      System.out.println("Factorial of the number is "+factNumber);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        fact(n);
        sc.close();
    }
}
