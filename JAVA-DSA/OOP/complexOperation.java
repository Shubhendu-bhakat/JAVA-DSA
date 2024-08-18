import java.util.Scanner;
public class complexOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part : ");
        int real1 = sc.nextInt();
        int real2 = sc.nextInt();
        System.out.print("Enter the imaginary part : ");
        int compleax1 = sc.nextInt();
        int compleax2 = sc.nextInt();
        compleax c = new compleax();
        System.out.println("sum of real parts : "+c.sum(real1, real2)); 
        System.out.println("sum of compleax parts : "+c.sum(compleax1, compleax2));
        System.out.println("diff of real parts : "+c.dif(real1, real2)); 
        System.out.println("diff of compleax parts : "+c.dif(compleax1, compleax2));
        System.out.println("prod of real parts : "+c.prod(real1, real2)); 
        System.out.println("prod of compleax parts : "+c.prod(compleax1, compleax2));
        sc.close();
    }
}

class compleax {
    int sum(int real1, int real2) {
        return real1 + real2;
    }
    int prod(int real,int real2){
        return real*real2;
    }
    int dif(int real,int real1){
        return real-real1;
    }
}
