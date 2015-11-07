package solution;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = EqualorLarger(nums,target);
        if(start==nums.length||nums[start]!=target) return new int[]{-1,-1};
        return new int[]{start,EqualorLarger(nums,target+1)-1};
        
    }
    public int EqualorLarger(int[] nums, int target){
        int start = 0;
        int end = nums.length;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
