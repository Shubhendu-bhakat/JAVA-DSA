import java.util.ArrayList;
public class basicOperation {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2,3);
        System.out.println(list);
        System.out.println(list.contains(3));
        list.remove(2);
        System.out.println(list);
        int n =  list.get(0);
        System.out.println(n);
        list.set(0,10);
        System.out.println(list);
    }
}