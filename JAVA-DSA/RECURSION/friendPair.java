public class friendPair {
    public static int pairUp(int n ){
        if(n==1| n==2){
            return n;
        }
        return pairUp(n-1)+ (n-1)*pairUp(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pairUp(4));
    }
}
