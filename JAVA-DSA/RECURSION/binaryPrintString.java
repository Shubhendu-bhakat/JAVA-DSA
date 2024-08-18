public class binaryPrintString {
    public static void printBinaryString(int n,int lastplace,String s ){
        //base case
        if(n == 0){
            System.out.println(s);
            return;
        }
        if(lastplace == 0){
            printBinaryString(n-1, 0, s+"0");
            printBinaryString(n-1, 1, s+"1");
        }
        else{
            printBinaryString(n-1, 0, s+"0");
        }
        // //work
        // printBinaryString(n-1, 0, s+"0");
        // if(lastplace == 0){
        //     printBinaryString(n-1, 1, s+"1");
        // }
    }
    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
