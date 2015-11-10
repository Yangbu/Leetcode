package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length==0 || nums==null) return result;
        Set<String> set = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        result.add(temp);
        for(int i=1; i<nums.length; i++){
            List<List<Integer>> new1 = new ArrayList<>();
            for(int j=0; j<=i; j++){
                for(List<Integer> l:result){
                    List<Integer> new2 = new ArrayList<>(l);
                    new2.add(j,nums[i]);
                    if(set.add(new2.toString())) new1.add(new2);
                }
            }
            result = new1;
        }
        return result;
    }
}
