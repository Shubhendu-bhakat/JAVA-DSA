//brute force 
public class SubArrayOfAnArray {
    public static void printSubArrays(int numbers[]) {
        int total = 0;
        int sum = 0;
        int sumMin = 0;
        int sumMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {// THIS loop is for printing the elememts from i to j
                    System.out.print("[" + numbers[k] + "]");
                    sum = sum+numbers[k];                   
                }
                total++;
                System.out.println("The sum of the above subarray is = "+sum);
                if(sumMax<sum){
                    sumMax = sum;
                }
                if(sum<sumMin){
                    sumMin = sum;
                }
                sum = 0;
            }
            System.out.println(); 
        }
        System.out.println("Total subarray are = "+total);
        System.out.println("The maximum of sum of sub-Arrays is : "+sumMax);
        System.out.println("The maximum of sum of sub-Arrays is : "+sumMin);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2,3,4};
        printSubArrays(numbers);
    }
}
