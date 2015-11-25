package solution;

import java.util.Stack;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0 || matrix[0].length==0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] height = new int[col+1];
        int max=0;
        for(int i=0; i<row; i++){
            Stack<Integer> result = new Stack<>();
            for(int j=0; j<col+1; j++){
                if(j<col){
                    if(matrix[i][j] == '1'){
                        height[j]++;
                    }else{
                        height[j]=0;
                    }
                }
                while(!result.isEmpty() && height[j]<height[result.peek()] ){
                    int area = height[result.pop()] * (result.isEmpty()? j : j-result.peek()-1);
                    max = Math.max(max,area);
                    
                }
                result.push(j);
            }
        }
        return max;
    }
}
