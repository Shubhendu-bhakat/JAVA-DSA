public class selctionSort {
    public static void selectionsort(int nums[]){
        int size = nums.length;
        for(int i=0;i<size-1;i++){
            int minPos = i;
            for(int j=i+1;j<size;j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
        for(int i=0;i<size;i++){
            System.out.print(nums[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,4,1,3,2};
        selectionsort(nums);
    }
}
