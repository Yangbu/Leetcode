package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            while((i+1<nums.length) && (nums[i+1]-nums[i]==1)){
                i++;
            }
            if(a == nums[i]){
                result.add(a + " ");
            }
            else{
                result.add(a + "->"+nums[i]);
            }
                
        }
        return result;
    }
}
