package FUNCTIONS;

import java.util.Scanner;

public class product {
    public static int prod(int n,int m){
       return(n*m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the second number : ");
        int m = sc.nextInt();
        System.out.println(prod(n, m));
        sc.close();
    }
}
