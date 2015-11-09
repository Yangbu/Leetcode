package solution;

public class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length -1;
        int left = 0;
        int right = 0;
        int max = 0;
        while(start<end){
            left = Math.max(left,height[start]);
            right = Math.max(right,height[end]);
            if(left<right){
                max += left - height[start];
                start++;
            }else{
                max += right - height[end];
                end--;
            }
        }
        return max;
    }
}
