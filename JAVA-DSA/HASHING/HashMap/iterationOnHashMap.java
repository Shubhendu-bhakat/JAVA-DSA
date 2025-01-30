import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class iterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 23);
        hm.put("Japan", 10);
        hm.put("Us", 15);
        hm.put("China", 30);
        //using keySet 
    //     Set<String> s = hm.keySet();
    //    for (String k : s) {
    //         System.out.println("Key is : "+ k +" values is : "+hm.get(k));
    //    }

    //using entrySet() for iteration
    
    for (Map.Entry<String,Integer> entry : hm.entrySet()) {
        String key = entry.getKey();
        int value = entry.getValue();
        System.out.println("Key "+ key + " value "+value);
    }
    }
}
