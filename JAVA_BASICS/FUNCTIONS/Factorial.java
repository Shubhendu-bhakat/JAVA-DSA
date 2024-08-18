package FUNCTIONS;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n ){
        if(n<0){
            return -1;
        }
        if(n>=1){
            return n*fact(n-1);
        }
        else{
            return 1;
            
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt(); 
        if(fact(n)== -1){
            System.out.println("Not a valid input ");
        }
        else{
            System.out.println(fact(n));
        }
    }
}
