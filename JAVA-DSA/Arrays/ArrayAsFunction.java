import java.util.Scanner;

public class ArrayAsFunction {
    public static void ArrayUpdate(int marks[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array updated value");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayUpdate(marks);
        System.out.println("Array updated elements are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
