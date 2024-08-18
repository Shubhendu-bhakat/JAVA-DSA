public class rotatedArray {
    //search in rotated sorted array
    public static int search(int ar[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si +(ei-si)/2;
        if(ar[mid] == target)
        {
            return mid;
        }
        //line l1
        if(ar[si] <= ar[mid]){
            if(ar[si] <=target && target <= ar[mid]){
                return search(ar, target, si, mid-1);
            }
            else{
                search(ar, target, mid+1, ei);
            }
        }//line 2
        else{
            if(ar[mid]<=target && target <=ar[ei]){
                return search(ar, target, mid+1, ei);
            }
            else{
                return search(ar, target, si, mid-1);
            }
        }
        return mid;
      
    }
    public static void main(String[] args) {
        int ar[] = {4,5,6,7,0,1,2};
        int target = 0;
       int idx =  search(ar, target, 0, ar.length-1);
       System.out.println(idx);
    }
}
