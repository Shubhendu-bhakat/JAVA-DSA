import java.util.HashMap;
import java.util.LinkedHashMap;

public class intro {

    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 101);
        lhm.put("India1", 101);
        lhm.put("India2", 101);
        lhm.put("India3", 101);
        System.out.println(lhm);

        //comparision with hashmap
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 101);
        hm.put("India1", 101);
        hm.put("India2", 101);
        hm.put("India3", 101);
        System.out.println(hm);
    }
}