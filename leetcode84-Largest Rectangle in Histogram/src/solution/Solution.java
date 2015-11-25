package solution;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] height) {
        height = Arrays.copyOf(height,height.length+1);
        Stack<Integer> result = new Stack<>();
        int maxRes = 0;
        for(int i=0; i<height.length; i++){
            while(!result.isEmpty() && height[i]<height[result.peek()] ){
                int max = height[result.pop()] * (result.isEmpty()? i : i - result.peek() - 1);
                maxRes = Math.max(max,maxRes);
            }
            result.push(i);
        }
        return maxRes;
    }
}
