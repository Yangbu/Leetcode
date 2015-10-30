package solution;

import java.util.Arrays;

public class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = s.length();
        StringBuilder[] result = new StringBuilder[numRows];
        
        for (int i = 0; i < result.length; i++) result[i] = new StringBuilder();
        
        int i=0;
        while(i<len){
            for(int idx=0; idx<numRows && i<len;idx++){
                result[idx].append(c[i++]);
            }
            for(int idx=numRows-2; idx>=1 && i<len; idx--){
                result[idx].append(c[i++]);
            }
        }
        for(int j=1; j<result.length; j++){
            result[0].append(result[j]);
        }
        return result[0].toString();
    }
}
