//optimal solution 
public class prefixArraySum {
    public static void CalculatePrefixArray(int A[]) {
        int prefixArray[] = new int[A.length];
        int CurSum = 0;
        int maxSum = 0;
        prefixArray[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + A[i];
        }
        for (int i = 0; i < A.length; i++) {
            int start = i;
            for (int j = 0; j < A.length; j++) {
                int end = j;
                CurSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start - 1];
                if (maxSum < CurSum) {
                    maxSum = CurSum;
                }
            }
        }
        System.out.println("maximum sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int A[] = { 1, -2, 5, 6, -9, 8, 7 };
        CalculatePrefixArray(A);
    }
}
