/**
 * 
 */
package solution;

/**
 * The main idea is to store the last seen positions 
 * of current (i-th) characters in both strings. 
 * If previously stored positions are different then we 
 * know that the fact they're occuring in the current i-th 
 * position simultaneously is a mistake. We could use a map 
 * for storing but as we deal with chars which are basically 
 * ints and can be used as indices we can do the whole thing with an array.
 *
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] all = new int[512];
        for(int i=0; i<s.length(); i++){
            if(all[s.charAt(i)] != all[t.charAt(i)+256]) return false;
            all[s.charAt(i)] =all[t.charAt(i)+256] = i+1;
        }
        return true;
    }
}
