package Recursion_ques;

public class Maze {
    static void MazeFunc(boolean[][] board , int row , int col,String res){
        if(row == board.length-1 && col == board[0].length - 1){
            System.out.print(res+" ");
            return;
        }
        if(!board[row][col]){
            return;
        }
        board[row][col] = false;
        if(row<board.length-1){
            MazeFunc(board,row+1 ,col,res+"D");
        }
        if(col<board[0].length - 1){
            MazeFunc(board,row,col+1,res+"R");
        }
//        if(col<2 && row<2){
//            MazeFunc(board,row+1, col+1 , res+"Di");
//        }
        if(row>0){
            MazeFunc(board,row-1,col,res+"U");
        }
        if(col>0){
            MazeFunc(board,row,col-1,res+"L");
        }
        board[row][col] = true;
    }
    public static void main(String[] args) {
        boolean[][] board = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };
          MazeFunc(board , 0 , 0,"");
    }
}
