public class quickSort {
    public static void printArray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void QuickSort(int ar[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pvt =  partition(ar,si,ei);
        QuickSort(ar, si, pvt-1);//for left subarray
        QuickSort(ar, pvt+1, ei);//for right subarray
    }
    public static int partition(int ar[],int si,int ei){
        int pivit = ar[ei];//first pivort element is the last element of array (considered)
        int i = si-1;//to make places for swapiing of elelmts 
        for(int j=si;j<ei;j++){
            if(ar[j]<=pivit){ //swap if the cur elelment is less then or equal to pivit
                //swap
                i++;
                int temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
            }
        }
        i++;
        //if the cur element is bigger the pivit it should be swapped with pivit elemts index not pivit 
        int temp = pivit;
        ar[ei] = ar[i]; //swipping with pivit elelments index 
        ar[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int ar[] = {6,3,5,1,0,-2,4,-1,-23,8,9,23,45,7,89,6667,32,12};
        QuickSort(ar, 0, ar.length-1);
        printArray(ar);
    }
}
