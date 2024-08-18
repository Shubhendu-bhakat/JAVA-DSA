public class insertionSort {
    public static void InsertionSort(int a[]){
        int size = a.length;
        for(int i=1;i<size;i++){
            int curElem =a[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev>=0 && a[prev]>curElem){
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curElem;
           
        }
        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[] = {2,3,4,1,5};
        InsertionSort(a);
    }
}
