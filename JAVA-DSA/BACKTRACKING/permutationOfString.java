public class permutationOfString {
    public static void findPermutation(String s,String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
           String sn = s.substring(0, i)+s.substring(i+1);
            findPermutation(sn, ans+currentChar);
        }
    }
    public static void main(String[] args) {
       String s ="abc";
       findPermutation(s, ""); 
    }
}
