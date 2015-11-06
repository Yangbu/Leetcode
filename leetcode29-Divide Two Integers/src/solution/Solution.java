package solution;

/*
 * http://m.blog.csdn.net/blog/DERRANTCM/47052683
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0 || (dividend==Integer.MIN_VALUE && divisor ==-1)) return Integer.MAX_VALUE;
        int sign = dividend>0 ^ divisor>0 ? -1:1;
        long dnd = Math.abs((long)dividend);
        long dor = Math.abs((long)divisor);
        int result = 0;
        while(dnd>=dor){
            int m=1;
            long tmp = dor;
            while(dnd>=(tmp<<1)){
                tmp<<=1;
                m<<=1;
            }
            
            dnd -=tmp;
            result +=m;  
        }
        return result*sign;
    }

}
