package FUNCTIONS;

public class BinomialCofficient {
    public static int fact(int n) {
        if (n < 0) {
            return -1;
        }
        if (n >= 1) {
            return n * fact(n - 1);
        } else {
            return 1;

        }

    }

    public static int binom(int n, int r) {
        int nfact = fact(n);
        int rfact = fact(r);
        int rffact = fact(n-r);
        return (nfact / (rfact * rffact));
    }
    public static void main(String[] args) {
        System.out.println("binomial cofficient of 5 is "+binom(5, 2));
    }
}
