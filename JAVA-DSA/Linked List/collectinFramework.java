import java.util.LinkedList;
import java.util.Collections;
public class collectinFramework {
    public static <T> boolean palandromCheck(LinkedList<T> list){
        if(list.size() == 0 || list.size() == 1){
            return true;
        }
        int left = 0;
        int right = list.size()-1;
        while(left < right){
            if( list.get(left) != list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static <T> LinkedList<T> reverseLl(LinkedList<T> list){
        Collections.reverse(list);
        return list;
    }
public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(2);
    ll.addLast(1);
    ll.addFirst(23);
    System.out.println(ll);
    System.out.println(palandromCheck(ll));
   System.out.println(reverseLl(ll));

}
}