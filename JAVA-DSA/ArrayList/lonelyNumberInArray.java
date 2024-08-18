import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lonelyNumberInArray {
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
           if(nums[i])
           
        }

        return list1;
    }

    private static boolean freq(int ar[],int number) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
           if(ar[i] == number){
            count++;
           }
        }
        System.out.println(count);
        if (count >= 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int ar[] = { 10, 5, 6, 8, 10 };
        System.out.println(findLonely(ar));
    }
}
