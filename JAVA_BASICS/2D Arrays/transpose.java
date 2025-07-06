import java.util.*;
public class transpose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int col = sc.nextInt();
	    int ar[][] = new int[row][col];
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            ar[i][j] = sc.nextInt();
	        }
	    }
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            System.out.printf(ar[j][i]+" ");
	        }
	    }
	    System.out.println(" ");
        sc.close();
    }
}