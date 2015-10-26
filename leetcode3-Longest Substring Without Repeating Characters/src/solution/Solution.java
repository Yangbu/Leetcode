package solution;

import java.util.HashMap;
import java.util.Map;

/*
 * the basic idea is, keep a hashmap which stores the characters in string as keys 
 * and their positions as values, and keep two pointers which define the max substring. 
 * move the right pointer to scan through the string , and meanwhile update the hashmap. 
 * If the character is already in the hashmap, then move the left pointer to the right 
 * of the same character last found. Note that the two pointers can only move forward.
 * 
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int temp = 0;
        int max = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==null){
                temp++;
            }else if(i-map.get(s.charAt(i)) <= temp){
                temp = i-map.get(s.charAt(i));
            }else{
                temp++;
            }
            map.put(s.charAt(i),i);
            max = Math.max(temp,max);
        }
        return max;
    }
}
