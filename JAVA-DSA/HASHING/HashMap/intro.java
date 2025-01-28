import java.util.HashMap;

public class intro{
    public static void main(String args[]){
        //creation 
        HashMap<String,Integer> hm = new HashMap<>();
        //put operation 
        hm.put("India", 10);
        hm.put("china", 12);
        hm.put("Us",5);
        hm.put("Japan", 1);
        //get operation
        System.out.println(hm.get("china"));

    }
}