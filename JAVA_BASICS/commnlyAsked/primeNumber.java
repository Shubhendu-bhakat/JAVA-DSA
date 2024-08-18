import java.util.Scanner;

public class primeNumber {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i == 0){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(isPrime(n)==true){
        System.out.print("Prime number ");
       }
       else{
        System.out.print("Not a prime number ");
       }
       sc.close();
    }
}