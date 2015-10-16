/**
 * 
 */
package solution;

/**This is kind of cheating,
 *  but the idea is that a power of two in binary form has and only has one "1".
 *
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n)==1;
        
    }
}
