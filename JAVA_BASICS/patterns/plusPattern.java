import java.util.Scanner;

public class plusPattern {
    public static void printSwastik(int n){
        int mid = n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==mid||j==mid) || (j==0 && i<=mid)|| (i==0 && j>=mid)|| (i==n-1 && j<=mid)||(j== n-1 && i>=mid)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
           
        }
    }
    public static void printStart(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printpattern(int rows){
        int mid = (rows/2)+1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i==mid || j==mid){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStart(n);
    }
}
