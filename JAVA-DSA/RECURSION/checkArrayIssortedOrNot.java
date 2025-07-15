public class checkArrayIssortedOrNot {
    public static boolean isSorted(int ar[] , int i){
        if(i==ar.length-1){
            return true;    
        }
        if(ar[i]>ar[i+1])return false;
        return isSorted(ar , i+1);
    }
    public static void main(String[] args) {
        int ar[] = {2,3,4,5,6,7,8 ,10};
        System.out.println(isSorted(ar, 0));
    }
}
