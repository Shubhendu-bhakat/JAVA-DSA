public class palandromString {
    public static boolean checkPalandrom( String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("not palandrom");
            return false;
            }
            
        }
            System.out.println("palandrom");
            return true;

    } 

    public static void main(String[] args) {
        String s = "racecar";
        checkPalandrom(s);
    }
    
}