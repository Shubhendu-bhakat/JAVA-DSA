public class findOccuranceIndex {
    public static void printIndexOcur(int ar[],int key,int index,StringBuilder s){
        //base case 
        if(index == ar.length)
        {
            System.out.println(s);
            return;
        }
        //work
        if(ar[index] == key){
            printIndexOcur(ar, key, index+1, s.append(index));
        }else{
            printIndexOcur(ar, key, index+1, s);
        }
      
    }
    public static void main(String[] args) {
        int ar[] = {3,2,4,5,6,2,7,2,2};
        printIndexOcur(ar, 2, 0, new StringBuilder(""));
    }
}
