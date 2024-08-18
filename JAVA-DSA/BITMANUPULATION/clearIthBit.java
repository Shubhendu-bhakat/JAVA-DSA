public class clearIthBit {
    public static int CleatIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(CleatIthBit(10, 1));
    }
}
