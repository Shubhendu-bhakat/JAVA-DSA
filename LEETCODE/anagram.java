//return boolean value based on the string are anagram or not
import java.util.Arrays;

public class anagram {
    public static boolean checkAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        
        char s1New[] = s.toCharArray();
        char s2New[] = t.toCharArray();
       Arrays.sort(s1New);
       Arrays.sort(s2New);
       for(int i=0;i<s1New.length;i++){
          if(s1New[i] != s2New[i]){
            return false;
          }
       }
       return true;
    }
    public static void main(String[] args) {
        String s = "tap";
        String s1 = "pat";
        System.out.println(checkAnagram(s1, s));;
    }
}
