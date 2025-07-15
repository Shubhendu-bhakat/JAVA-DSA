import java.util.ArrayList;
import java.util.Scanner;

public class tnp {
        public static int kthLargestFactorOfN(int n, int k) {
            ArrayList<Integer> factors = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors.add(i);
                }
            }
            if (k <= factors.size()) {
                return factors.get(factors.size() - k);
            } else {
                return -1; 
            }
        }
        public static int choclateWrapper(int chocolate, int wrapperLeft){
        int totalQuantity = chocolate + wrapperLeft; // total quantity of chocolate
        int totalDays = 0;
        while (totalQuantity >= 7) {
            int days = totalQuantity / 7; // days the chocolate will continue
            totalDays += days;
            totalQuantity = days + (totalQuantity % 7); // remaining wrappers plus new chocolates
        }
        totalDays += chocolate; // initial chocolates
        return totalDays;
        }
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int k = sc.nextInt();
     System.out.println(kthLargestFactorOfN(N, k));   
    // // int chocolate = sc.nextInt();
    // // int wrapperLeft = sc.nextInt();
    // int n = sc.nextInt();
    // printPattern(n);

    // // System.out.println(choclateWrapper(chocolate, wrapperLeft));
    }
}