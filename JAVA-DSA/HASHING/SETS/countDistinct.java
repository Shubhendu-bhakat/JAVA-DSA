import java.util.HashMap;


public class countDistinct {
    public static void printSwastik(int n){
        int mid = n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==mid||j==mid) || (j==0 && i<=mid)|| (i==0 && j>=mid)|| (i==n-1 && j<=mid)||(j== n-1 && i>=mid)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
           
        }
    }
    public static int countDistinctElement(int ar[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        if(ar.length==0){
            return 0;
        }
        for(int num:ar){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
      
        return hm.size();
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,7,8,2,3,4,5,6,7,8,8,5,3,2,2,1,1,1,3,3,4,4,5,5,5,5,5,9,0};
        System.out.println(countDistinctElement(ar));
        printSwastik(50);
    }
}
