public class printXpoweN {
    public static int printAbso(int ar[],int num,int dif){
        int count =0;
        for(int i=0;i<ar.length;i++){
            int diffre = num - ar[i];
            if(diffre <0 ){
                diffre = -(diffre);
            }
            if(diffre<=dif){
                count++;
            }
        }
        return count;
    }



    public static int printPowInLogn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPow = printPowInLogn(x, n / 2);
        if (n % 2 != 0) {

            return x * halfPow * halfPow;
        }
        return halfPow * halfPow;
    }

    public static int printXtoThePowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * printXtoThePowerN(x, n - 1);
    }

    public static void main(String[] args) {
        int ar[] = {12,3,14,56,77,13};
        System.out.println(printAbso(ar, 13, 2));
    }
}
