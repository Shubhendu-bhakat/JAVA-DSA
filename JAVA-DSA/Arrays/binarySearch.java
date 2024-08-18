public class binarySearch {
    public static int ArrayBinarySearch(int Array[],int item){
        int start = 0;
        int end = Array.length-1;
        while(start<=end){
          int mid = (start+end)/2;
          if(Array[mid]==item){
            return mid;
          }else if(Array[mid]<item){
            start = mid + 1;
          }
          else{
            end = mid -1;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Array[] = {1,2,3,4,5,6,8,9,10};
        System.out.println(ArrayBinarySearch(Array, 9));
        
    }
}
