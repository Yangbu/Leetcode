package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        helper(result , temp,  k, n , 1);
        return result;
    }
    public void helper(List<List<Integer>> result , List<Integer> temp, int k, int n , int pos){
        if(k==0){
           if(n==0){
            result.add(new ArrayList<>(temp));
           } 
                    return;
        }
        for(int i=pos; i <= n/k && i <10; i++ ){
            temp.add(i);
            helper(result,temp,k-1, n-i, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
