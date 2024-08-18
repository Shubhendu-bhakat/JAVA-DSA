package patterns;

public class Butterfly_Pattern {
    public static void Butterfl_print(int n){
        //first half 
        for(int i=1;i<=n;i++){
            
            //star 1 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space as 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star as 2nd 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half 
        for(int i=n;i>=1;i--){
             //star 1 
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space as 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star as 2nd 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
                
        }
    }
    public static void main(String[] args) {
      Butterfl_print(4);
    }
}
