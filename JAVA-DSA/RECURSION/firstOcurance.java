public class firstOcurance {
    public static int findOccurance(int ar[],int key,int i){
        if(i == ar.length-1){
            return i;
        }
        if(ar[i] == key){
            return i;
        }
       return findOccurance(ar, key,i+1);
    }
    public static void main(String[] args) {
        int ar[] = {1,2,6,40,5,6,7,8,67};
        System.out.println(findOccurance(ar, 67, 0));
    }
}
