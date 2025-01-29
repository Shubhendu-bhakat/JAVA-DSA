import java.util.HashSet;

public class introHashSet {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(6);
        hs.add(null);
        System.out.println(hs);
    }
}