package Recursion_ques;

import java.util.Objects;

public class WordSearch {
    static  void searchFunc(String[][] board , String word,int row,int col){
          if(word.isEmpty()){
              System.out.println(true);
              return;
          }
          if((row < 0 || col < 0||row>=board.length || col >= board[0].length|| !Objects.equals(board[row][col], String.valueOf(word.charAt(0))))){
                       return;
          }
          String ch = String.valueOf(word.charAt(0));
          String temp = board[row][col];
        board[row][col] = ".";
          if(row<board.length-1) {
              if (ch.equals(board[row][col])) {
                  searchFunc(board, word.substring(1), row + 1, col);
              }
          }
          if(col<board[0].length-1){
              if(ch.equals(board[row][col])){
              searchFunc(board,word.substring(1),row,col+1);
              }
          }
        if(row>0){
            if(ch.equals(board[row][col])){
                searchFunc(board,word.substring(1),row,col+1);
            }
        }
        if(col>0){
            if(ch.equals(board[row][col])){
                searchFunc(board,word.substring(1),row,col-1);
            }

        }
        board[row][col] = temp;
    }
    public static void main(String[] args) {
        String[][] board = {{"A","B","C","E"},
                            {"S","F","C","S"},
                             {"A","D","E","E"}};
        String word = "ABCCED";
        System.out.println(word.charAt(0));
//         searchFunc(board,word,0,0);
    }
}
