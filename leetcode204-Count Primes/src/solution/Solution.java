/**
 * 
 */
package solution;

import java.util.Arrays;

/**
 * From 2, delete all the multiples less than n
 *
 */
public class Solution {
    public int countPrimes(int n) {
        boolean[] result = new boolean[n];
        int sum = 0;
        for(int i=2; i*i <n; i++){
            for(int j=i; i*j <n; j++){
                result[i*j] = true;
            }
        }
        for(int i=2; i<result.length; i++){
            if(result[i]==false) sum++;
        }
        return sum;
    }
}
