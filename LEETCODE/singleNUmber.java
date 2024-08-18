//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1
// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4

import java.util.Arrays;

public class singleNUmber {
    public static void singleNumber(int[] nums) {
        Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        if(nums[i] == nums[i+1]){
            i++;
        }else{
            System.out.println(nums[i]);
        }
       }
    }
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2,3,3};
        singleNumber(nums);
    }
}
