import java.util.ArrayList;

public class acc {
    public static int findCost(String s){
        int sum =0;
       ArrayList<Integer> edu = new ArrayList<>();
       ArrayList<Integer> unedu = new ArrayList<>();

        for(int i=0;i<s.length();i++){
           if(s.charAt(i) == '1'){
                edu.add(i);
           }
           else{
            unedu.add(i);
           }
        }
        for(int i=0;i<unedu.size();i++){
            int minLen = s.length();
            for(int j=0;j<edu.size();j++){
                
            }
        }
    }
    public static void main(String[] args) {
        //1 educated 0 uneducated 

    }
}
