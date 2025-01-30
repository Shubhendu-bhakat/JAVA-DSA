import java.util.HashMap;
import java.util.Map;

public class countDistinct {
    public static int countDistinctElement(int ar[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        if(ar.length==0){
            return 0;
        }
        int count =0;
        for(int num:ar){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,7,8,2,3,4,5,6,7,8,8,5,3,2,2,1,1,1,3,3,4,4,5,5,5,5,5,9,0};
        System.out.println(countDistinctElement(ar));
    }
}
