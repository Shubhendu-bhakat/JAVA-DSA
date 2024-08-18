import java.util.ArrayList;
import java.util.Arrays;

public class pairSum2 {
    public static boolean sumInRotatedArray(ArrayList<Integer> list , int target){
        int n = list.size();
        int pv = -1;
        for(int i=0;i<n-1;i++){
            if(list.get(i) > list.get(i+1)){
                pv = i;
                break;
            }
        }
        int lp = pv+1;
        int rp = pv;
        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(sumInRotatedArray(list, 9));
    }
}
