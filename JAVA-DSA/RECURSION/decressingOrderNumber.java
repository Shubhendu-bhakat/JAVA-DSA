
public class decressingOrderNumber {
    public static void printNumber(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printNumber(n);
    }
}