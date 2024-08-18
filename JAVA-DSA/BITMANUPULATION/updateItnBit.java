public class updateItnBit {
    public static int setIthBit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int updateItnBit1(int n,int i,int value){
        if(value==0){
           return clearIthBit(n, i);
        }
        else{
           return setIthBit(n, i);
        }
        
    }
    public static int hammingWeight(int n) {
        int sum = 0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1) == 1){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       System.out.println(hammingWeight(11));
    }
}
