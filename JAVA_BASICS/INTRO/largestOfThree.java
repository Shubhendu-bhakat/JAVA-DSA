import java.util.Scanner;

public class largestOfThree {
    //a = 5 b = 4 c = 8
    private static void findLargest(int a ,int b , int c){
       if(a>b && b>c)
       {
        System.out.println("A is largest : "+a);
       }
       else if(a>b && b<c){
            System.out.println(" c ia largest : "+c);
       }
       else
       {
        System.out.println("b is largest : "+ b);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 ,num3;
        System.out.println("enter the value of 3 numbers ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        findLargest(num1, num2, num3);
        sc.close();
    }
}
