public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };

        if (solve(board)){
            display(board);
        }else {
            System.out.println("Sudoku cannot be solved!");
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //This is how we are replacing  the r, c from arguments

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            //If you found some empty elements in row, then break;\
            if (!emptyLeft){
                break;
            }


        }
        if(emptyLeft){
            return true;
            // sudoku is solved
        }

        //Backtrack
        for (int number = 1; number <= 9; number++){
            if (isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    //found the answer
                    return true;
                }else {
                    //Backtrack
                    board[row][col] = 0;
                }
            }
        }
        // Means sudoku can't be solved
        return false;
    }

    static void display(int[][] board){
        for (int[] row: board){
            for (int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        // check the row
        for (int i = 0; i < board.length; i++) {
            // Check if  the number is in the row or not
            if (board[row][i] == num){
                return false;
            }
        }

        //Check the col
        for (int[] nums : board) {
            // Check if  the number is in the row or not
            if (nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
