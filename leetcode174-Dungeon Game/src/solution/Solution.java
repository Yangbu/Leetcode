package solution;

public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;
        int[][] health = new int[row][col];
        health[row-1][col-1] = Math.max(1,1-dungeon[row-1][col-1]);
        for(int i=row-2; i>=0; i--){
            health[i][col-1] = Math.max(1,health[i+1][col-1]-dungeon[i][col-1]);
        }
        for(int j=col-2; j>=0; j--){
            health[row-1][j] = Math.max(1,health[row-1][j+1]-dungeon[row-1][j]);
        }
        for(int i=row-2; i>=0; i--){
            for(int j=col-2; j>=0; j--){
                int right = Math.max(1,health[i][j+1]-dungeon[i][j]);
                int down = Math.max(1,health[i+1][j]-dungeon[i][j]);
                health[i][j] = Math.min(right,down);
            }
        }
        return health[0][0];
    }
}
