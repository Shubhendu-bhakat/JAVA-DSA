public class clearLastIthBit {
    public static int clearIthBitt(int n,int i){
      int bitmask = (~0)<<i;
      return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBitt(10, 2));
    }
}
