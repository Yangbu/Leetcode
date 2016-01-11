package solution;

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if(k<=0 || len == 0) return 0;
        int result = 0;
        if(k >= len/2){
            for(int i=1; i<len; i++){
                if(prices[i]-prices[i-1]>0) result += prices[i]-prices[i-1];
            }
            return result;
        }
        int[][] t = new int[k+1][len];
        for(int i=1; i<=k; i++){
            int tmpMax = -prices[0];
            for(int j=1; j<len; j++){
                t[i][j] = Math.max(t[i][j-1],prices[j]+tmpMax);
                tmpMax = Math.max(tmpMax,t[i-1][j-1]-prices[j]);
            }
        }
        return t[k][len-1];
    }
}
