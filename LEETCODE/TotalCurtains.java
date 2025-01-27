import java.util.ArrayList;
import java.util.Scanner;

public class TotalCurtains {
    public static int findCurtains(int ar[]){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(ar[i]<12){
                res.add(0);
            }else{
                res.add(ar[i]/12);
            }
        }
        int sum =0;
        for(int i=0;i<res.size();i++){
            sum +=res.get(i);
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int curtains[] = new int[length];
        for(int i=0;i<length;i++){
            curtains[i] = sc.nextInt();
        }
        System.out.println(findCurtains(curtains));
    }
}
