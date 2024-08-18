public class reverseOfAnArray {
    public static void swap(int Array[],int first ,int last){
        int temp = Array[first];
        Array[first] = Array[last];
        Array[last] = temp;
    }
    public static void ArrayReverse(int Array[]) {
        int first = 0;
        int last = Array.length - 1;
        while (first < last) {
            swap(Array, first, last);
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int Array[] = { 1, 2, 3, 4, 5 };
        ArrayReverse(Array);
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
