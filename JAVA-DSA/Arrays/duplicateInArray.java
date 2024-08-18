import java.util.Arrays;

public class duplicateInArray {
    public static boolean removeDup(int nums[]){
        int size = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<size;i++){
            if(nums[i-1]==nums[i]){
                System.out.println("Duplicate");
                return true;
            }
        }
        System.out.println("not duplicate ");
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,2,8,9,1,2,3,4};
        removeDup(nums);

    }
}
