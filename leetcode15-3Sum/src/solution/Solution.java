package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new LinkedList<> ();
        Arrays.sort(num);
        for(int i = 0; i<num.length - 2; i++){
            if(i == 0 ||(i>0 && (num[i] != num[i-1]))){
                int sum = 0 - num[i];
                int j =i+1, l = num.length -1;
                while(j < l){
                    if( num[j] + num[l] == sum){
                        res.add(Arrays.asList(num[i], num[j],num[l]));
                        while(j<l && num[j+1] == num[j]) j++;
                        while(j<l && num[l-1] == num[l]) l--;
                        j++;l--;
                    }else if(num[j] + num[l] < sum){
                        j++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return res;
        
    }
}
