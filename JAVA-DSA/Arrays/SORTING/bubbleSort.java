
public class bubbleSort {
    public static void BubbleSort(int num[]) {
        int size = num.length;
        int swapCout = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    swapCout++;
                }
            }
        }
        for (int i = 0; i < size; i++){
            System.out.print(num[i] + "\t");
        }
        System.out.println();
        System.out.println("swap count =" + swapCout);
    }

    public static void main(String[] args) {
        int num[] = { 4, 8, 54, 2, 41, 90 };
        BubbleSort(num);
    }
}
