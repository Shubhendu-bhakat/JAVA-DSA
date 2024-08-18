public class countSort {
    public static void CountSort(int a[]){
      int largest = Integer.MIN_VALUE; //it is predefined constant that holds the minimum possible smallest value 
      //that can be hold by 32 bit 
      for(int i=0;i<a.length;i++){
        largest = Math.max(largest, a[i]);
      }
      int count[] = new int[largest+1];
      for(int i=0;i<a.length;i++){
        count[a[i]]++; 
      }
    }
    public static void PrintArray(int a[]){
      for(int k=0;k<a.length;k++){
          System.out.print(a[k]+"\t");
      }
  }
    public static void main(String[] args) {
    int a[] = {2,8,9,4,3,1,0};
    CountSort(a);
    PrintArray(a);
    }
}
///repeat not understood
//basic sorting teachique