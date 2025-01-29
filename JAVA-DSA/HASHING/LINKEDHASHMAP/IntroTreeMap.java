import java.util.HashMap;
import java.util.*;

public class IntroTreeMap {
    public static void main(String[] args) {
        //LinkedHashMap keeps the track of the order of the key inserted
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 101);
        lhm.put("China", 101);
        lhm.put("USA", 101);
        lhm.put("Japan", 101);
        System.out.println(lhm);

        //comparision with hashmap
        //hashmap does not keep track of our order of key inserted 
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 101);
        hm.put("China", 101);
        hm.put("USA", 101);
        hm.put("Japan", 101);
        System.out.println(hm);

        //treeMap
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 101);
        tm.put("China", 101);
        tm.put("USA", 101);
        tm.put("Japan", 101);
        System.out.println(tm);

    }
}
