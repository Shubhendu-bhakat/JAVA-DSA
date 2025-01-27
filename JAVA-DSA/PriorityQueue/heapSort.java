class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        //buiod maxHeap
        for(int i=n/2;i>=0;i--){
            heapify(nums,i,n);
        }
        //push largest to last
        for(int i=n-1;i>0;i--){
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums,0,i);
        }
        return nums;
    }
    private void heapify(int nums[],int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left < size && nums[maxIdx] < nums[left]){
            maxIdx = left;
        }
        if(right < size && nums[maxIdx] < nums[right]){
            maxIdx = right;
        }
        if(maxIdx != i){
            int temp = nums[i];
            nums[i] = nums[maxIdx];
            nums[maxIdx] = temp;

            heapify(nums,maxIdx,size); 
        }
    }
}
