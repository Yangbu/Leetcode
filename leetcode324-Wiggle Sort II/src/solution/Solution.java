package solution;

public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] copy = Arrays.copyOf(nums,nums.length);
        int largeIndex = nums.length-1;
        int smallIndex = (nums.length+1)/2-1;
        for(int i=0; i<nums.length; i++){
            nums[i] = i%2==0? copy[smallIndex-i/2]:copy[largeIndex-i/2];
        }
    }
}
