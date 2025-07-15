import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class printAllBinaryStringExceptConsicutiveOne {
    public static List<String> printBinaryStrings(int n ,char lp , String s){
        List<String> list = new ArrayList<>();
        if(n==0){
            list.add(s);
            Collections.sort(list);
            return list;
        }
        if(lp == '0'){
            list.addAll(printBinaryStrings(n-1, '1' , s+"1" ));
           list.addAll(printBinaryStrings(n-1, '0', s+"0"));
        }
        else list.addAll( printBinaryStrings(n-1, '0', s+"0"));
        Collections.sort(list);
        return list;
        
    }
    public static void main(String[] args) {
        System.out.println(printBinaryStrings(3, '0', ""));
    }
}
