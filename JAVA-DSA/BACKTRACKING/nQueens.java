public class nQueens {
    private static int count = 0;
    private static boolean isSafe(char board[][],int row ,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }

        }
        //daugonal ;eft up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //daigonally right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void setQueens(char board[][],int row){
        if(row == board.length){
            count++;
            // printBoard(board);
            return;
        }
       
            for(int j=0;j<board.length;j++){
                if(isSafe(board,row,j) == true){
                    board[row][j] = 'Q';
                    setQueens(board, row+1);
                    board[row][j] = 'x';
                }
             
            }
    }
    public static void printBoard(char board[][]){
        System.out.println("-------------chess board -----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = 'x';
            }
        }
        setQueens(board, 0);
        System.out.println(count);
    }
}
