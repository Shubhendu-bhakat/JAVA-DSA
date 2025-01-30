import java.util.*;

public class longestChainPair {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int length = 1;
        int lastEndTime = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] > lastEndTime){
                length++;
                lastEndTime = pairs[i][1];
            }
        }
        return length;

    }

    public static void main(String[] args) {
        int pairs[][] = {{1,2},{2,3},{3,4}};
        System.out.println(findLongestChain(pairs));
    }
}
