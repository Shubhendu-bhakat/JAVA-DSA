public class tilingProblem {
    public static int fixingTilesWays(int n){  //(2*n) is the floor size n=length 2 is breadth
        if(n==0||n==1){
            return 1;
        }
        int fm1 = fixingTilesWays(n-1);
        int fm2 = fixingTilesWays(n-2);
        int twoWays = fm1 +fm2;
        return twoWays;
    }
    public static void main(String[] args){
        System.out.println(fixingTilesWays(5));
    }
}

