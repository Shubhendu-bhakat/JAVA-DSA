public class CountDigitOne {
    public static int countDigitOne(int n) {
        int count = 0;
        for (long place = 1; place <= n; place *= 10) {
            long left = n / place;
            long right = n % place;
            long currentDigit = left % 10;
            
            // Counting number of 1s contributed by the current place
            if (currentDigit == 0) {
                count += left / 10 * place;
            } else if (currentDigit == 1) {
                count += left / 10 * place + right + 1;
            } else {
                count += (left / 10 + 1) * place;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 13;
        int result = countDigitOne(n);
        System.out.println("Total number of digit 1 appearing in all non-negative integers less than or equal to " + n + " is: " + result);
    }
}

