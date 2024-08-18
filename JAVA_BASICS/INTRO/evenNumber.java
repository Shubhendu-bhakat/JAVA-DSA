import java.util.Scanner;
//call by value and call by refrence program 
public class evenNumber {
   
    // public static void swap(int a,int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.print("value by function : ");
    //     System.out.println("a = "+ a);
    //     System.out.println("b = " +b);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print("even number ("+num+")");
        }
        else{
            System.out.print("Odd number "+num);
        }
        sc.close();
        // int a = 5;
        // int b = 10;
        // swap(a, b);   
        // System.out.println("value  by main fucntion ");
        // System.out.println(a);
        // System.out.println(b);
    }
}
