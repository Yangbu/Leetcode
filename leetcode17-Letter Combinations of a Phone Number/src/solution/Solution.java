package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0) return result;
        String d[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        result.add("");
        for(int i=0; i<digits.length(); i++){
            result = combine(d[digits.charAt(i)-'0'],result);
        }
        return result;
    }
    
    public List<String> combine(String d , List<String> result){
        List<String> res = new ArrayList<>();
        for(int i=0; i<d.length(); i++){
            for(String s : result){
            res.add(s+d.charAt(i));
        }
        }
        return res;
    }
}
