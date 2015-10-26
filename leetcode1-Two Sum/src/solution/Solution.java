package solution;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	   public int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0; i<nums.length; i++){
	            if(map.containsKey(nums[i])){
	                int index = map.get(nums[i]);
	                result[0] = index+1;
	                result[1] = i+1;
	            }else{
	                map.put(target-nums[i],i);
	            }
	        }
	        return result;
	    }
}
