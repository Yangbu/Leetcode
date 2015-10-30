package solution;


public class Solution {
    public int reverse(int x) {
        double result = 0;
        while(x!=0){
            int m = x%10;
            x /= 10;
            result = m+10*result;
        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }
}
