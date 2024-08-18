import java.util.Scanner;

public class checkForEvenOdd {
    public static int checkEvenOdd(int n){
        int m = n&1;
        if(m==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(checkEvenOdd(n));
        sc.close();
    }
}
