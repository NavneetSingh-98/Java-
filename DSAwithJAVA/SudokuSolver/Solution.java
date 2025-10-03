package DSAwithJAVA.SudokuSolver;

public class Solution {

    public boolean isSafe(char[][] borad, int row , int col , int number ){
        for(int i= 0; i<borad.length; i++){
            if(borad[i][col] == (char)(number + '0')){
                return false;
            }
              if(borad[row][i] == (char)(number + '0')){
                return false;
              }
            
        }
        //grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i = sr; i<sr+3; i++){
            for(int j= sc; j<sc+3; j++){
                if(borad[i][j] == (char)(number + '0' )){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean hepler(char[][] board , int row, int col){

        if(row == board.length){
            return true;
        }

        int nrow =0;
        int ncol =0;
        if(col != board.length-1){
            nrow = row;
            ncol = col-1;
        }else{
            nrow = row + 1;
            ncol = 0;
        }
        if(board[row][col] != '.'){
           if(hepler(board, nrow, ncol)){
            return true;
           }
        }else{
            for(int i= 1; i<=9; i++){
                if(isSafe(board,row , col, i)){
                    board[row][col] = (char)(i - '0');
                   if(hepler(board, nrow, ncol)){
                    return true;
                   }else{
                    board[row][col] = '.';
                   }
                }
            }
        }
        return false;

    }
    public void  solveSodoku(char[][] board){
        hepler(board, 0, 0);

    }

}
