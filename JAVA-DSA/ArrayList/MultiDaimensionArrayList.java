import java.util.ArrayList;

public class MultiDaimensionArrayList {
    public static int[] twoSum(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length-1;
        int ar[] = new int[2];
        while(lp!=rp){
            if(nums[lp] + nums[rp] == target){
                ar[0] = lp;
                ar[1] = rp;
                System.out.print(ar[0]+" ");
                System.out.println(ar[1]);
                return ar;
            }
              if(nums[lp]+nums[rp]<target){ //
                lp++;
            }
             else{
                rp--;
             }
        }
        System.out.println("Null");
        return ar;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
          ArrayList<Integer> curreArrayList = mainList.get(i);
          for(int j=0;j<curreArrayList.size();j++){
            System.out.print(curreArrayList.get(j)+" ");
          }
          System.out.println();
        }
    }
}



    