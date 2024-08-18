public class lastOccurance {
    public static int lastOccur(int ar[],int i,int key){
        if(i == ar.length){
            return -1;
        }
        int isFound = lastOccur(ar, i+1, key);
        if(isFound != -1){
            return isFound;
        }
        if(ar[i]==key){
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,6,40,5,6,7,8,1,2,3,1,67};
        System.out.println(lastOccur(ar, 0, 1));
    }
}
