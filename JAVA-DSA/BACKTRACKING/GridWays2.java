
public class GridWays2 {
    // using permutation trick
    public static int uniquePaths(int n, int m) {
        long res = (fact(n - 1 + m - 1))/(fact(n - 1)*(fact(m - 1)));
        return (int) res;
    }

    private static long fact(int n) {
        long f = 1;
        for (int i = n; i >= 1; i--) {
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(23, 12));
    }
}
