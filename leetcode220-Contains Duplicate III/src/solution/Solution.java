/**
 * 
 */
package solution;

import java.util.TreeSet;

/**
 * This problem requires to maintain a window of size k of the previous values that can be queried for value ranges. 
 * The best data structure to do that is Binary Search Tree. As a result maintaining the tree of size k will result 
 * in time complexity O(N lg K). In order to check if there exists any value of range abs(nums[i] - nums[j]) to 
 * simple queries can be executed both of time complexity O(lg K)

Here is the whole solution using TreeMap.
 *
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length <2 || k <=0) return false;
        TreeSet<Integer> result = new TreeSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(i>k) result.remove(nums[i-k-1]);
            Integer floor = result.floor(nums[i]+t);
            Integer ceil = result.ceiling(nums[i]-t);
            if((floor !=null && floor >= nums[i])||(ceil != null && ceil <= nums[i]))  return true;
            result.add(nums[i]);
            
            
        }
        return false;
    }

}
