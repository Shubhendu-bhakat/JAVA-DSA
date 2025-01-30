import java.util.HashSet;
import java.util.Iterator;

public class introHashSet {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(6);
        hs.add(null);
        System.out.println(hs);
        if(hs.contains(1) ){
            System.out.println("Hello");
        }
      Iterator it = hs.iterator();
      while(it.hasNext()){
        System.out.println(it.next());
      } 
    }
}