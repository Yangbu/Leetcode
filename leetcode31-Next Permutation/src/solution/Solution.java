package solution;

public class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length-2;
        while(l>=0 && nums[l]>=nums[l+1]) l--;
        
        if(l>=0){
        int j = l+1;
        while(j<nums.length && nums[l]<nums[j]) j++;
        exchange(nums,l,j-1);
        }
        
        l++;
        int k = nums.length-1;
        while(l<k){
            exchange(nums,l,k);
            l++;
            k--;
            
        }
    }
    public void exchange(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
