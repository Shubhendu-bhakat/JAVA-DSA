import java.util.Arrays;

public class stringSort {
    public static void sortString(String s[]){
       Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        String[] s = {"char","Array","apple","mango"};
        sortString(s);
      
    }
}
