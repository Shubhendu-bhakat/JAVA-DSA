public class GridWays {
    public static int uniquePaths(int i,int j,int m,int n){
        //base case
        if(i==n-1&& j==m-1){ //last cell condition
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        //right
        int w1 = uniquePaths(i+1, j, m, n);
        //down 
        int w2 = uniquePaths(i, j+1, m, n);
        int totalWays = w1+w2;
        return totalWays;
    }
    private static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
       }
    public static void main(String[] args) {
        System.out.println(uniquePaths(0, 0, 3, 7));
        System.out.println(fact(5));
    }
}
