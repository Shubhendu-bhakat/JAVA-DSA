package PracticeOfSortingAlgo;
//descending order sorting in java using bubble ,selection ,insetion and counting sort
public class bubbleSort {
    public static void BubbleSort(int a[]){
        
        for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-1-i;j++){
            if(a[j]<a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }  
           }
        }  
    }
    public static void PrintArray(int a[]){
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+"\t");
        }
    }
    public static void SelectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<a.length;j++){
                    if(a[minPos]<a[j]){
                        minPos = j;
                    }
            }
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;

        }
    }


    public static void InsertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            
        }
    }
    public static void main(String[] args) {
        int a[] = {1,7,9,3,8,6,5};
        // BubbleSort(a);
        SelectionSort(a);
        PrintArray(a);
      
    }
}
