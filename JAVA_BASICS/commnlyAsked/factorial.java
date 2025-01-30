import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        // System.out.println(fact(5));
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int ar[][] = new int[rowSize][colSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                ar[i][j] = sc.nextInt();
            }
        }
       
    }
}
