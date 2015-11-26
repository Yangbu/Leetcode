package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        result.add(temp);
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int size = result.size();
            int dup = 0;
            while(i+1<nums.length && nums[i+1]==nums[i]){
                dup++;
                i++;
            }
            for(int j=0; j<size; j++){
                List<Integer> l1 = new ArrayList<>(result.get(j));
                for(int k=0; k<=dup; k++){
                    l1.add(nums[i]);
                    result.add(new ArrayList<>(l1));
                }
            }
        }
        return result;
    }
}
