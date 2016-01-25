package solution;

public class Solution {
    private static final int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        int row = matrix.length, col = matrix[0].length;
        int[][] distance = new int[row][col];
        int result = 1;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result = Math.max(result,dfs(matrix,row,col,i,j,distance));
            }
        }
        return result;
    }
    public int dfs(int[][] matrix, int row, int col, int i, int j, int[][] distance){
        if(distance[i][j] != 0) return distance[i][j];
        int max = 1;
        for(int[] m:move){
            int x = i+m[0], y = j+m[1];
            if(x<0 || x>=row || y<0 || y>=col || matrix[x][y]<=matrix[i][j]) continue;
            int len = 1+dfs(matrix,row,col,x,y,distance);
            max = Math.max(len,max);
        }
        distance[i][j] = max;
        return max;
    }
}
