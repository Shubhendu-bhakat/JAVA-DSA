import java.util.Scanner;

public class educated {
  public static int findRestCount(int x,int y){
    if (x>= y) {
        return 0;
    }
    int completeSegments = y/ x;
    if (y % x == 0) {
        return completeSegments - 1;
    } else {
        return completeSegments;
    }
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        System.out.println(findRestCount(x, y));
    }
}