package solution;
/*
 * Already sorted
 * 
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=1) return nums.length;
        int cur = nums[0];
        int i=1;
        for(int j=1; j<nums.length;j++){
            if(cur != nums[j]){
                cur = nums[j];
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
