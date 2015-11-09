package solution;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int end = partation(nums)+1;
        int result = end;
        for(int i=0; i<end; i++){
            int temp = Math.abs(nums[i]);
            if(temp<=end){
                nums[temp-1] = (nums[temp-1]>0)? -nums[temp-1]: nums[temp-1];
            }
        }
        for(int i=0; i<end;i++){
            if(nums[i]>0){
                result = i;
                break;
            }
        }
        return result+1;
    }
    public int partation(int[] nums){
        int m=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                nums[++m] = nums[i];
            }
        }
        return m;
    }
}
