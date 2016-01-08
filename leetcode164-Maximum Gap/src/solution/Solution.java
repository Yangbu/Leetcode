package solution;

public class Solution {
    public int maximumGap(int[] nums) {
        if(nums==null || nums.length < 2) return 0;
        int max= nums[0], min = nums[0];
        for(int n : nums){
            max = Math.max(n,max);
            min = Math.min(n,min);
        }
        int gap = (int)Math.ceil((double)(max-min)/(nums.length-1));
        int[] bucketMin = new int[nums.length-1];
        int[] bucketMax = new int[nums.length-1];
        Arrays.fill(bucketMin,Integer.MAX_VALUE);
        Arrays.fill(bucketMax,Integer.MIN_VALUE);
        for(int n:nums){
            if(n==min || n==max) continue;
            int index = (n-min)/gap;
            bucketMin[index] = Math.min(n,bucketMin[index]);
            bucketMax[index] = Math.max(n,bucketMax[index]);
        }
        int result = Integer.MIN_VALUE;
        int pre = min;
        for(int i=0; i<nums.length-1; i++){
            if(bucketMin[i]==Integer.MAX_VALUE && bucketMax[i]==Integer.MIN_VALUE) continue;
            result = Math.max(result,bucketMin[i]-pre);
            pre = bucketMax[i];
        }
        result = Math.max(result,max-pre);
        return result;
    }
}
