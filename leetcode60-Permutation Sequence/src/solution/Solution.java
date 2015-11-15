package solution;

import java.util.ArrayList;
import java.util.List;

/*
 * The logic is as follows: for n numbers the permutations can be divided to (n-1)! groups, 
 * thus k/(n-1)! indicates the index of current number, and k%(n-1)! denotes remaining sequence 
 * (to the right). We keep doing this until n reaches 0, then we get n numbers permutations that is kth.
 * 
 * 
 * 
 */

public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num = new ArrayList<>();
        for(int i=0; i<n; i++) num.add(i+1);
        int fact =1;
        for(int i=2; i<=n; i++) fact *=i;
        StringBuilder result = new StringBuilder();
        for(k--; n>0; n--){
            fact /= n;
            result.append(num.remove(k/fact));
            k %= fact;
        }
        return result.toString();
    }
}
