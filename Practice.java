package BranchRecursion;

import java.util.*;

public class Practice {
    static int n = 4;
    static char board[][] = new char[n][n];
    static ArrayList<String>list=new ArrayList<>();
    static void saveBoard(char[][] board,List<List<String>>Board){
        String row="";
        List<String> newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
               
            }
              newBoard.add(row);
        }
       Board.add(newBoard);
       System.out.println(Board);

    }

    static boolean canWePlaceQueen(int row, int col) {
        // Check from Up
        for (int i = row; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //Left Diagonal
        for (int i = row,j=col; i >= 0&&j>=0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }   
        //Right Diagonal
        for (int i = row,j=col; i >= 0&&j<board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
    return true; 
    }

    static int countNumberofWays(int row) {
        int count = 0;
        if(row==board.length){
            List<List<String>>Board=new ArrayList<>();
            saveBoard(board, Board);
            return 1;
        }
        for (int col = 0; col < board.length; col++) {
            if(canWePlaceQueen(row, col)){
            board[row][col] = 'Q';
            count = count + countNumberofWays(row + 1);
            board[row][col] = '.';
            }
        }
        return count;

    }

    public static void main(String[] args) {
       System.out.println( countNumberofWays(0));

    }
}
