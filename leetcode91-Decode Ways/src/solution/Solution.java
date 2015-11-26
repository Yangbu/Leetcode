package solution;

public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int [] result = new int[n+1];
        result[n] = 1;
        result[n-1] = (s.charAt(n-1)=='0')? 0:1;
        
        for(int i=n-2; i>=0; i--){
            if(s.charAt(i) == '0') continue;
            else{
                result[i] = (Integer.parseInt(s.substring(i,i+2))>26)? result[i+1]: result[i+1]+result[i+2];
            }
        }
        return result[0];
    }
}
