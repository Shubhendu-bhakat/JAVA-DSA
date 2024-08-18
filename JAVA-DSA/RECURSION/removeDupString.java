/**
 * removeDupString
 */
public class removeDupString {
    public static void removeDip(String s ,int indx ,StringBuilder str , boolean map[]){
        if(indx == s.length()){
            System.out.println(str);
            return;
        }
        char curChar = s.charAt(indx);
        if(map[curChar-'a']==true){
            //duplicate in neture 
            //no append
            removeDip(s, indx+1, str, map);
        }
        else{
            map[curChar-'a'] = true;
            removeDip(s, indx+1, str.append(curChar), map);
        }
    }
    public static void main(String[] args) {
        String s = "shubhendu";
        removeDip(s, 0, new StringBuilder(""), new boolean[26]);
    }
}