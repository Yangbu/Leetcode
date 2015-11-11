package solution;

public class Solution {
    private Set<Integer> column = new HashSet<>();
    private Set<Integer> diag1 = new HashSet<>();
    private Set<Integer> diag2 = new HashSet<>();
    private List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        if(n==0) return result;
        int[][] board = new int[n][n];
        helper(0,board,n);
        return result;
        
    }
    public void helper(int row, int[][] board, int n){
        for(int col=0; col<n;col++){
            if(column.contains(col)) continue;
            int d1 = row+col;
            if(diag1.contains(d1)) continue;
            int d2 = row-col;
            if(diag2.contains(d2)) continue;
            
            if(row == n-1){
                board[row][col] =1;
                result.add(toList(board,n));
                board[row][col] = 0;
            }else{
                column.add(col);
                diag1.add(d1);
                diag2.add(d2);
                board[row][col] =1;
                helper(row+1,board,n);
                board[row][col]=0;
                column.remove(col);
                diag1.remove(d1);
                diag2.remove(d2);
                
            }
        }
    }
    public List<String> toList(int[][] board, int n){
        List<String> res = new ArrayList<>();
        for(int i=0;i<n; i++){
            StringBuilder temp = new StringBuilder();
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    temp.append("Q");
                }else{
                    temp.append(".");
                }
            }
            res.add(temp.toString());
        }
        return res;
    }
}
