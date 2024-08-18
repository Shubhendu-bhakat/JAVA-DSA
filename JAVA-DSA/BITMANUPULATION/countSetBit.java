public class countSetBit {
    public static int countSetbit(int n){
        int count = 0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                count++;
            }
        }
        return count;
    }
    // public static int countSet(int n){
    //     int coun = 0;
    //     while(n>0){
    //         if(((n>>1)&1)==1){
    //             coun++;
    //         }
    //     }
    //     return coun;
    // }
    public static void main(String[] args) {
        System.out.println(countSetbit(10));
    }
}
