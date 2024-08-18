public class factorial {
    public static int  printFcat(int n){
        if(n ==0){
            return 1;
        }
        return n*printFcat(n-1);

    }
    public static void main(String[] args) {
        System.out.println(printFcat(5));
    }
}
