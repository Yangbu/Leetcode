package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        Arrays.sort(strs);
        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!map.containsKey(s)) {
                map.put(s,new ArrayList<String>());
            }
                map.get(s).add(strs[i]);
            
        }
        return new ArrayList<List<String>>(map.values());
    }
}
