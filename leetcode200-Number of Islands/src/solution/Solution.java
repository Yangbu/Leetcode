package solution;

public class Solution {
	// Two land cells ['1'] are considered from the same island if 
	// they are horizontally or vertically adjacent (possible moves (-1,0),(0,1),(0,-1),(1,0))
    static int[] xMove = {-1,1,0,0};
    static int[] yMove = {0,0,-1,1};
    public int numIslands(char[][] grid) {
        int sum = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    around(grid,i,j);
                    sum++;
                }
            }
        }
        return sum;
    }
    public void around(char[][] grid, int i, int j){
        grid[i][j] = 'x';
        for(int d=0; d<xMove.length; d++){
            if(i+yMove[d] < grid.length && i+yMove[d]>= 0 && j+xMove[d]<grid[0].length && j+xMove[d]>=0 && grid[i+yMove[d]][j+xMove[d]] == '1' ){
                around(grid,i+yMove[d], j+xMove[d] );
            }
        }
        
    }
}
