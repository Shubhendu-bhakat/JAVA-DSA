public class q1 {
    public static void separatePos(int ar[], int si, int ei, StringBuilder s, StringBuilder s2) {
        if (si > ei) {
            System.out.println("Negative numbers: " + s);
            System.out.println("Positive numbers: " + s2);
            return;
        }
        if (ar[si] < 0) {
            s.append(ar[si]).append(" ");
        } else {
            s2.append(ar[si]).append(" ");
        }
        separatePos(ar, si + 1, ei, s, s2);
    }
    public static void additionPos(int ar[],int si,int sum){
        if(si>=ar.length-1)
        {
            System.out.println(sum);
            return;
        }
        if(ar[si] >=0){
            sum += ar[si];
        }
        additionPos(ar,si+1,sum);
    }

    public static void main(String[] args) {
        int ar[] = {1, 2, 4, 5, 6, 7, 7, -1, -3, 0, -6, 5, -7};
        // separatePos(ar, 0, ar.length - 1, new StringBuilder(), new StringBuilder());
        additionPos(ar,0,0);
    }
}
