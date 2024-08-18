import java.util.Arrays;

public class majorityElement {
    public static int countMajority(int ar[]){
      Arrays.sort(ar);
      int n = ar.length;
      return ar[n/2];
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,51,1,1,1,1,1,1,1,1,4,3,4,5,6,6,6,6,6,6,6,6,6,6,6,66,6,6,6};
       System.out.println(countMajority(ar));
    }
}
