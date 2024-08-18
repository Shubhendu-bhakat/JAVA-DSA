public class transposeOfMatrix {
    public static void PrintTranspose(int matrix[][]){
        int newMtarix[][] = new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                newMtarix[j][i] = matrix[i][j];
            }

        }
        for(int i=0;i<newMtarix.length;i++){
            for(int j=0;j<newMtarix[0].length;j++){
                System.out.print(newMtarix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                            {4,5,6,},
                        {7,8,9}};
        PrintTranspose(matrix);
    }
}
