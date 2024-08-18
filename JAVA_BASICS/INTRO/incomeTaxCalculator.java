import java.util.Scanner;

public class incomeTaxCalculator {
    private static void calculateIncomeTax(int income){
        if(income<= 5){
            System.out.print("0 % income tax , your amount is "+income);
        }
        else if(income>5){
            System.out.print("you have to pay 20% tax , amount is "+((float)income*0.2));
        }
        else{
            System.out.print("you have to pay 30% tax , amount is "+( (float)income*0.3));   
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in lac : ");
        int income = sc.nextInt();
        calculateIncomeTax(income);
        sc.close();
    }
}
