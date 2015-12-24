package solution;

/*
*https://leetcode.com/discuss/18330/is-it-best-solution-with-o-n-o-1
*/

public class Solution {
    public int maxProfit(int[] prices) {
        int lowestBuyPrice1 = Integer.MAX_VALUE;
        int maxProfit1 = 0;
        int lowestBuyPrice2 = Integer.MAX_VALUE;
        int maxProfit2 = 0;
        for(int p:prices){
            lowestBuyPrice1 = Math.min(lowestBuyPrice1,p);
            maxProfit1 = Math.max(maxProfit1, p - lowestBuyPrice1);
            lowestBuyPrice2 = Math.min(lowestBuyPrice2, p-maxProfit1);
            maxProfit2 = Math.max(maxProfit2, p - lowestBuyPrice2);
        }
        return maxProfit2;
    }
}
