public class linearSearch {
    public static void linearSearch1(int matrix[][],int target){
        int targetCount = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == target){
                    targetCount++;
                }
            }
        }
        System.out.println("TOtal accourance is "+targetCount);
    }
    public static int secondRowSum(int matrix[][]){
        int Secsum = 0;
        
            for(int j=0;j<matrix[0].length;j++){
                Secsum = Secsum + matrix[1][j];
            }
        
        return Secsum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                        { 9,10,4,12},
                        {4,4,4,16}};
        // linearSearch1(matrix, 4);
        System.out.println(secondRowSum(matrix));
    }
}
