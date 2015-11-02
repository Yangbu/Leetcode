package solution;

/*
 * https://leetcode.com/discuss/59635/easy-concise-java-o-n-solution-with-proof-and-explanation
 * 
 */
public class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1;
        int max=0;
        while(start<end){
            max = Math.max(max,Math.min(height[start],height[end])*(end-start));
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}
