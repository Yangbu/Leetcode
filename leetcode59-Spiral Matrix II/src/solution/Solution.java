package solution;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if(n==0) return result;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        int num = 1;
        while(rowStart<=rowEnd && colStart <= colEnd){
            for(int col=colStart; col<=colEnd; col++){
                result[rowStart][col]=num++;
            }
            rowStart++;
            for(int row=rowStart; row<=rowEnd; row++){
                result[row][colEnd]=num++;
            }
            colEnd--;
            if(rowEnd > rowStart){
                for(int col=colEnd; col>=colStart; col--){
                    result[rowEnd][col]=num++;
                }
                rowEnd--;
            }
            if(colEnd>colStart){
                for(int row=rowEnd; row>=rowStart; row--){
                    result[row][colStart]=num++;
                }
                colStart++;
            }
        }
        return result;
        
    }
}
