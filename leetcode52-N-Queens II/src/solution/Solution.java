package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> column = new HashSet<>();
    private Set<Integer> diag1 = new HashSet<>();
    private Set<Integer> diag2 = new HashSet<>();
    int result = 0;
    
    public int totalNQueens(int n) {
        helper(0,n);
        return result;
    }
    public void helper(int row, int n){
        for(int col=0; col<n; col++){
            if(column.contains(col)) continue;
            int d1 = row+col;
            if(diag1.contains(d1)) continue;
            int d2 = row-col;
            if(diag2.contains(d2)) continue;
            
            if(row == n-1){
                result++;
            }else{
                column.add(col);
                diag1.add(d1);
                diag2.add(d2);
                helper(row+1,n);
                column.remove(col);
                diag1.remove(d1);
                diag2.remove(d2);
            }
        }
    }
}
