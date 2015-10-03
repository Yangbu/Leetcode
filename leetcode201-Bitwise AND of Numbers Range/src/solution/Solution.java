package solution;
/*The idea is very simple:

last bit of (odd number & even number) is 0.
when m != n, There is at least an odd number and an even number, so the last bit position result is 0.
Move m and n rigth a position.
Keep doing step 1,2,3 until m equal to n, use a factor to record the iteration time.
 * 
 * 
 */

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int result = 0;
        int i=0;
        while(m != n){
            m >>= 1;
            n >>= 1;
            i++;
        }
        return m<<i;
    }
}