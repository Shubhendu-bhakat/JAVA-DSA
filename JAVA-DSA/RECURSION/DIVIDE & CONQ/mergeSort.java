public class mergeSort {
    public static void printArray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+"\t");
        }
        System.out.println();
    }
    public static void MergeSort(int ar[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        MergeSort(ar, si, mid);// left part 
        MergeSort(ar, mid+1, ei);//right part 
        merge(ar,si,mid,ei);
    }
    public static void merge(int ar[],int si ,int mid,int ei){
        int temp[] = new int[ei-si+1];//temp array 
        int i = si;//temp variable for left subSorted array 
        int j = mid +1; //temp varible for right subsorted array
        int k = 0; // variable for temp array
        //this while condn will work for even number of elemets so we need to have other condn also 
        while(i<= mid && j<=ei){
            if(ar[i] < ar[j]){
                temp[k] = ar[i];
                i++;k++;
            }
            else{
                temp[k] = ar[j];
                j++;k++;
            }
        }
        //left overflow elements 
        while(i<=mid){
            temp[k++] = ar[i++];
        }
        //right overflow elements 
        while(j<=ei){
            temp[k++] = ar[j++];
        }
        //copying array elements from temp to original 
        for(int p =0 ,q = si;p<temp.length; p++ ,q++){
            ar[q] = temp[p];
        }
    }
   public static void main(String[] args) {
    int ar[] = {6,7,8,3,5,1,4,0,8,2,34,56,778,9,1,2,-4};
    MergeSort(ar, 0, ar.length-1);
    printArray(ar);
   }
    
}