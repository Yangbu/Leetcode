package solution;

public class Solution {
    public int numTrees(int n) {
        int[] Result = new int[n+1];
        Result[0] = Result[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i; j++){
                Result[i] += Result[j-1]*Result[i-j];
            }
        }
        return Result[n];
    }
}
