package solution;

public class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return 0;
        int minPre = nums[0], maxPre = nums[0], result = nums[0];
        int minNow, maxNow;
        for(int i=1; i<nums.length; i++){
            minNow = Math.min(Math.min(minPre*nums[i],maxPre*nums[i]),nums[i]);
            maxNow = Math.max(Math.max(minPre*nums[i],maxPre*nums[i]),nums[i]);
            result = Math.max(maxNow,result);
            minPre = minNow;
            maxPre = maxNow;
        }
        return result;
    }
}
