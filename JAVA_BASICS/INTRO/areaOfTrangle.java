import java.util.Scanner;

public class areaOfTrangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the length of the trangle : ");
            int length = sc.nextInt();
            System.out.print("enter the breadth of the trangle : ");
            int breadth = sc.nextInt();
            int area = (int) (0.5*length*breadth);
            System.err.print("area of the trangle is : "+ area);
        }
    }
}
