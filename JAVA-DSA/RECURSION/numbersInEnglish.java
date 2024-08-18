public class numbersInEnglish {
    public static void printInEnglish(int n,StringBuilder s,int index){
        
        String english[] = {"zero ","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
        String sn = Integer.toString(n);
        if(index == sn.length()){
            System.out.println(s);
            return;
        }
       
      char m  = sn.charAt(index);
        int m1 = m-'0';
        String sfinal = english[m1];
        printInEnglish(n, s.append(sfinal), index+1);
    }
    public static void main(String[] args) {
         printInEnglish(196, new StringBuilder(" "), 0);

        }
}
