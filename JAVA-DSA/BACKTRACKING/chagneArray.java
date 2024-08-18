
public class chagneArray {
    public static void ChangeArrayValue(int ar[],int i,int value){
        //base case
        if(i==ar.length){
            printArray(ar);
            return;
        }
        //recorsion
        ar[i] = value;
        ChangeArrayValue(ar, i+1, value+1);
        ar[i] = ar[i]-2;
    }
    public static void printArray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[] = new int[5];
        ChangeArrayValue(ar, 0, 1);
        printArray(ar);
    }
}