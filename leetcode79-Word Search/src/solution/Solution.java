package solution;

public class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(helper(board,word,i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, int i, int j, int index){
        if(index==word.length()) return true;
        if(i<0 || j<0 || i==board.length || j==board[0].length || board[i][j]!=word.charAt(index)) return false;
        board[i][j]='*';
        boolean result =  helper(board,word,i,j+1,index+1)||helper(board,word,i+1,j,index+1)||helper(board,word,i-1,j,index+1)||
               helper(board,word,i,j-1,index+1);
        board[i][j] = word.charAt(index);
        return result;
    }
}
