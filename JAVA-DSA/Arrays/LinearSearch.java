import java.util.Scanner;

public class LinearSearch {
    public static int ArrayLinearSearch(int Array[], int item) {
        int isFound = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == item) {
                isFound = i;
                break;
            }
        }
        return isFound;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size ");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.print("Enter the array Elements ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Enter the item to be search : ");
        int item = sc.nextInt();
        System.out.println("Element found at index " + ArrayLinearSearch(marks, item));

    }
}
