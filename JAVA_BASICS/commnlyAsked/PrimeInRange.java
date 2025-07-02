import java.util.Scanner;

public class PrimeInRange {
    public static boolean isPrime(int n){
        if(n<=1){
           return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0)return false;
        }
        return true;
    }
    public static void primeRange(int range ){
        for(int i=2;i<range;i++){
           if(isPrime(i)==true)System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        primeRange(range);
    }
}
