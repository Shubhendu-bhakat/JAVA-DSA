import java.util.ArrayList;

public class monotonicArraylist {
    public static boolean isMonotonic(ArrayList<Integer> list ){
        int count =1;
        int count2 = 0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) <= list.get(i+1)){ //non-decresing
                count++;
            }
            if(list.get(i) >= list.get(i+1)){
                count2++;
            }
        
            if(count == list.size() || count2 == list.size() ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);
        System.out.println(isMonotonic(list));
    }
}
