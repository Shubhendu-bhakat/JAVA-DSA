public class PrimeInRange {
    public static boolean isPrime(int n){
        boolean prime = true;
        if(n==1||n==2||n==3){
            System.out.println(n);
            return prime;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){  
                prime = false;
            }
            else{
                System.out.println(n);
                prime = true;
            }
        }
        return prime;
    }
    public static void primeRange(int range ){
        for(int i=2;i<range;i++){
           isPrime(i);
        }
    }
    public static void main(String[] args) {
        primeRange(20);
    }
}
