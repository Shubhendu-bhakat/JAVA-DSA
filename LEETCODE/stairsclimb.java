import java.util.Scanner;

public class stairsclimb {
    public static int climbStairs(int n,int m ){
        return n/m+n%m;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       System.out.println(climbStairs(n, m));

    }
}
