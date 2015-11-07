package solution;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            if(!isValid(board,i,i,0,8)) return false;
            if(!isValid(board,0,8,i,i)) return false;
        }
        for(int m=0; m<3; m++){
            for(int n=0; n<3; n++){
               if(!isValid(board,m*3,m*3+2,n*3,n*3+2)) return false; 
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int r1, int r2, int c1, int c2){
        Set<Character> set = new HashSet<>();
        for(int x=r1;x<=r2;x++){
            for(int y=c1; y<=c2; y++){
                if(board[x][y]=='.') continue;
                if(!set.add(board[x][y])) return false;
            }
        }
        return true;
    }

}
