public class permuTationOfInteger {
    public static String getPermutation(int n, int k) {
        String s = "";
      for(int i=1;i<=n;i++){
        s += Integer.toString(i);
      }
      if(s.length() == 0){
        return s;
      }
     for(int i=0;i<s.length();i++){
        //YEs
        getPermutation(n, k)
     }
    }
    public static void main(String[] args) {
            System.out.println(getPermutation(3, 0));
    }
}
