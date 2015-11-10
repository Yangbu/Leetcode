package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length==0 ) return result;
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        result.add(temp);
        for(int i=1; i<nums.length; i++){
            List<List<Integer>> new1 = new ArrayList<>();
            for(int j=0; j<=i; j++){
                for(List<Integer> l : result){
                    List<Integer> new2 = new ArrayList<>(l);
                    new2.add(j,nums[i]);
                    new1.add(new2);
                    
                    
                }
            }
            result = new1;
        }
        return result;
    }
}
