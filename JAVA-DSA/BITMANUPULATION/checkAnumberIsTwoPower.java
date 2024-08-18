public class checkAnumberIsTwoPower {
    public static boolean checkPower1(int n){
        int count =0;
        if(n<=0){
            return false;
        }
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            if(count>=2){
                System.out.println("no 2`s power");
                return false;
            }
        }
        System.out.println("2`s power");
        return true;
    }
    public static boolean checkPower2(int n){
       if(n<=0){
        return false;
       }
       int m = n & (n-1);
       if(m==0){
        return true;
       }
       else{
        return false;
       }
    }
    public static void main(String[] args) {
        // checkPower1(3);
        //checkPower2(3);
    }
}
