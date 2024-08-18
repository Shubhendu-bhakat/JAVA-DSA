public class palandrom {
    public static void checkPalandrom(int n ){
        int temp = n;
        int newDig = 0;
        while(n>0){
            int lastdig = n %10;
            newDig = (newDig*10) + lastdig; //palandrom logic //since the 121 has once ,1oth ,and 100th place so *10
            System.out.println(newDig);
            n = n/10;
        }
        if(temp == newDig){
            System.out.println("palandrom ");
        }
        else{
            System.out.println("not a palandrom ");
        }
    }
    public static void main(String[] args) {
        checkPalandrom(121);
       
    }
}
