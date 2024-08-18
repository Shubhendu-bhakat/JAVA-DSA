import java.util.Scanner;
public class duplicatePrint {
    public static void rem(int n){
        Scanner sc = new Scanner(System.in);
           while(n-->0){
           String s = sc.nextLine();
           int len = s.length();
           if(len<=10){
               System.out.println(s);
           }
           if(len > 10){
           
                  System.out.print(s.charAt(0));
                  System.out.print(len-2);
                  System.out.println(s.charAt(len-1));
               
           }
           sc.close();
       }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       rem(t);
    
    }
}