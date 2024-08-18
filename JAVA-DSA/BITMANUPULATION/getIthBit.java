import java.util.Scanner;

public class getIthBit {
    public static void getIthhBit(int n ,int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            System.out.println("ith bit is 0");
        }
        else{
            System.out.println("ith bit is 1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the i value : ");
        int i = sc.nextInt();
        getIthhBit(n, i);
        sc.close();

    }
}

