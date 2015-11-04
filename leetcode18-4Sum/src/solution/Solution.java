package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length<4) return result;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int e = nums.length-1; e>=i+3; e--){
                if(e<nums.length-1 && nums[e] == nums[e+1]) continue;
                int sum = target - nums[i] - nums[e];
                int j = i+1;
                int l = e-1;
                while(j<l){
                    if(j>i+1 && nums[j]==nums[j-1]) {
                        j++;
                        continue;
                    }
                    if(l<e-1 && nums[l]==nums[l+1]) {
                        l--;
                        continue;
                    }
                    if(nums[j]+nums[l] == sum){
                        result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[e]));
                        j++;l--;
                    }else if(nums[j] + nums[l] < sum){
                        j++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
