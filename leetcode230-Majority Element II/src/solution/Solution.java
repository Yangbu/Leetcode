package solution;

/*
 * There are at most 2 elemnts meeting the requirements
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int c1 = 0;
        int c2 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == c1){
                count1++;
            }else if(nums[i] == c2){
                count2++;
            }else if(count1 ==0){
                c1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                c2 = nums[i];
                count2 = 1;
            }else{
                count1--; count2--;
            }
        }
         count1 = 0; count2 = 0;
        for(int i=0; i<n; i++){
            if(c1 == nums[i]){
                count1++;
            }else if(c2 == nums[i]){
                count2++;
            }
        }
        if(count1 > n/3) result.add(c1);
        if(count2 > n/3) result.add(c2);
        return result;
    }
}
