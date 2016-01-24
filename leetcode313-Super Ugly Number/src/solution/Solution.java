package solution;

public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] result = new int[n];
        result[0] = 1;
        int[] index = new int[primes.length];
        for(int i=1; i<n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<index.length; j++){
                min = Math.min(min,result[index[j]]*primes[j]);
            }
            result[i] = min;
            for(int j=0; j<index.length; j++){
                if(result[i] % primes[j]==0) index[j]++;
            }
        }
        return result[n-1];
    }
}
