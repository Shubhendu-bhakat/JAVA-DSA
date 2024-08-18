import java.util.Scanner;

public class sumOfEvenAndOddInteger {
    private static void sumOfEvenOdd(int ar[], int lenght) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < lenght; i++) {
            if (ar[i] % 2 == 0) {
                evenCount = evenCount + ar[i];
            } else {
                oddCount = oddCount + ar[i];
            }
        }
        System.out.println("Even count is : " + evenCount);
        System.out.println("Odd count is : " + oddCount);

    }

    public static void main(String[] args) {
        int lenght;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array : ");
        lenght = sc.nextInt();
        int[] ar = new int[lenght];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < lenght; i++) {
            ar[i] = sc.nextInt();

        }
        System.out.println("Array elements are : ");
        for (int i = 0; i < lenght; i++) {
            System.out.println(ar[i] + "\t");
        }
        sumOfEvenOdd(ar, lenght);
        sc.close();
    }
}
