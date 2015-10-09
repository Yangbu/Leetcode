/**
 * 
 */
package solution;

/**
 * However, since we already have a nice solution to the simpler problem.
 *  We do not want to throw it away. Then, it becomes how can we reduce this problem to the simpler one. 
 *  Actually, extending from the logic that if house i is not robbed, then you are free to choose whether to rob house i + 1,
 *   you can break the circle by assuming a house is not robbed.

For example, 1 -> 2 -> 3 -> 1 becomes 2 -> 3 if 1 is not robbed.

Since every house is either robbed or not robbed and at least half of the houses are not robbed, 
the solution is simply the larger of two cases with consecutive houses, i.e. house i not robbed, 
break the circle, solve it, or house i + 1 not robbed. Hence, the following solution.
 I chose i = n and i + 1 = 0 for simpler coding. But, you can choose whichever two consecutive ones.
 *
 */
public class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1) return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1, nums.length-1));
        
    }
        public int rob(int[] nums, int start, int end) {
        int preNo = 0;
        int preYes = 0;
        for(int i=start; i<=end; i++){
            int temp = preNo;
            preNo = Math.max(preNo, preYes);
            preYes = nums[i]+temp;
        }
        return Math.max(preNo,preYes);
}
}
