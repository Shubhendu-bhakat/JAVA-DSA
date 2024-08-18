import java.util.Scanner;

public class table {
    private static void printTable(int n ){
       for(int i=1;i<=10;i++)
       {
        int num = i*n;
        System.out.println(num);
       } 
    }

    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}
