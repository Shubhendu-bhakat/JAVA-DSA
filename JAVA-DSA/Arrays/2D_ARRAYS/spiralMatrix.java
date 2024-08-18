public class spiralMatrix {
    public static void PrintSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.println(matrix[startRow][j]);
            }
            //right 
            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.println(matrix[endRow][j]);
            }
            //left 
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.println(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static int DaigonalSum(int matrix[][]){
        //O(n^2) and bruteforce method so not suitable for any operations
        // int n = matrix.length;
        // int m = matrix[0].length;
        int sumPrimary = 0;
        int sumSecondary = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==j ){
        //             sumPrimary = sumPrimary +matrix[i][j];
        //         }
        //         if(i+j== n-1){
        //             sumSecondary = sumSecondary +matrix[i][j];
        //         }
        //     }
        // }
        //  return (sumPrimary + sumSecondary);

        
            //linear time complexity O(n)
            int netSum = 0;
        for(int i=0;i<matrix.length;i++){
            sumPrimary += matrix[i][i];
            if(i!=matrix.length-1-i){
                sumSecondary += matrix[i][matrix.length-1-i];
            }
            
        }
        netSum = sumPrimary+sumSecondary;
        return netSum;
    }
    public static boolean stareCaseSearch(int matrix[][] ,int target){
        int row = 0;
        int col = matrix[0].length-1;
    while(row<matrix.length && col >=0){
        if(matrix[row][col] == target){
            System.out.println("find key at "+"("+row+","+col+")");
            return true;
        }
        else if(target<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
       
    }
    System.out.println("not found");
    return false;
    } 
    public static boolean stareCaseSearch2(int matrix[][],int target){
        int row = matrix.length-1;
        int col = 0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                System.out.println("Elemts found at "+"("+row+","+col+")");
                return true;
            }
            else if(target>matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("Elemts not foubnd");
        return false;
    }
    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};
        int matrix[][] = {{1,2,3},
                    {4,5,6},
                     {7,8,9}};
        
        // PrintSpiral(matrix);
        stareCaseSearch2(matrix, 9);
        // System.out.println(DaigonalSum9matrix));
    }
}
