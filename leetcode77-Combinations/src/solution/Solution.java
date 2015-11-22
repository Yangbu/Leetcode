package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }
    public void helper(List<List<Integer>> result, List<Integer> list, int start, int n, int k){
        if(k==0){
            result.add(new ArrayList<>(list));
            return;
        }else{
            for(int i=start; i<=n; i++){
                list.add(i);
                helper(result,list,i+1,n,k-1);
                list.remove(list.size()-1);
            }
        }
    }
}
