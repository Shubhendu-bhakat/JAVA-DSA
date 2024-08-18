import java.util.Scanner;
public class reverseArray {
  


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] intArray = new int[size];
		for(int i=0;i<size;i++){
		    intArray[i] = sc.nextInt();
		}
		for(int i=size-1;i>=0;i--){
            if(i==0){
                System.out.print(intArray[i]);
                break;
            }
		   System.out.print(intArray[i]+" ");
		}
		
	}

}
