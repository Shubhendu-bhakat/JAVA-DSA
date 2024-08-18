public class DecTozBinary {
    public static int Decimal(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(Decimal(5));
    }
}
