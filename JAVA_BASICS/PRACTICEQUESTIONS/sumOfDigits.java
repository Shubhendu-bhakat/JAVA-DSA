public class sumOfDigits {
    public static int sumOfDig(int n ){
        int sum = 0;
        while(n>0){
            int lastdig = n%10;
            sum = sum + lastdig;
            n /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDig(123));
    }   
}
