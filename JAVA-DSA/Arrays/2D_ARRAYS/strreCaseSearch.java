public class strreCaseSearch {
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
         int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        // int matrix[][] = {{1,2,3},
        //             {4,5,6},
        //              {7,8,9}};
        stareCaseSearch2(matrix, 9);
        // System.out.println(DaigonalSum9matrix));
    }
}
