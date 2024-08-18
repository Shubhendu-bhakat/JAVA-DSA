public class lengthOfLastString {
    public static int lengthOfLastWord(String s) {
       String sn = s.trim(); //to remove unwanted space
       int len = 0;
       for(int i=0;i<sn.length();i++){
        if(sn.charAt(i) == ' '){
            len = 0;
        }
        else{
            len++;
        }
       }
       return len;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Shubhendu Bhakat  "));
    }
}
