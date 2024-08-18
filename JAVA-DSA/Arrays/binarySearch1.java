public class binarySearch1 {
    public static int binarySearch(int nums[],int item){
        int start = 0;
        int last = nums.length-1;
        while(start<=last){
            int mid = (start+last)/2;
            if(nums[mid]==item){
                return mid;
            }
            else if(nums[mid]<item){
                start = mid+1;
            }
            else{
                last = mid-1;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]= {2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(nums, 9));
    }
}
