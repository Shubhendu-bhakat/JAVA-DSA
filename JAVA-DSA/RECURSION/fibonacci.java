public class fibonacci {
    public static int fibo(int n){
        if(n ==0 || n==1){
            return n;
        }
        int m =  fibo(n-1) + fibo(n-2);
        return m;
    }
    public static void main(String[] args) {
        System.out.println(fibo(25));
    }
}
