public class pairsInAnArray {
    public static void ArrayPair(int Array[]){
        int tp = 0;
        for(int i=0;i<Array.length-1;i++){
            for(int j=i+1;j<Array.length;j++){
                System.out.print("("+Array[i]+","+Array[j]+")"+"\t");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are "+tp);
    }
    public static void main(String[] args) {
        int Array[] = {1,2,3,4};
        ArrayPair(Array);
}
}
