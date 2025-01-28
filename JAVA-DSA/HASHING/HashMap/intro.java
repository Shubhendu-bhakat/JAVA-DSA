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
        System.out.println(hm);
        //get function
        System.out.println(hm.get("India"));
        //size function and is Empty function and clear function
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm);

    }
}