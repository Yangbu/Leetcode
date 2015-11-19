package solution;

public class Solution {
    public void sortColors(int[] nums) {
        int i0=-1, i1=-1, i2=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                nums[++i2]=2;
                nums[++i1]=1;
                nums[++i0]=0;
            }else if(nums[i]==1){
                nums[++i2]=2;
                nums[++i1]=1;
            }else{
                nums[++i2]=2;
            }
        }
    }
}
