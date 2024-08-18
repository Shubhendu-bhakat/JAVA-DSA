public class lengthOfString {
    public static int printLength(String s){
        if(s.equals("") == true){
            return 0;
        }
        else{
            return printLength(s.substring(1)+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(printLength("shubhendu"));
    }
}
