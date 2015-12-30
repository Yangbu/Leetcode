package solution;

public class Solution {
    public int minCut(String s) {
        int[] result = new int[s.length()+1];
        for(int i=0; i<result.length-1; i++) result[i] = Integer.MAX_VALUE;
        result[s.length()] = -1;
        for(int i=s.length()-1; i>=0; i--){
            for(int l=i,r=i; l>=0 && r<s.length() && s.charAt(l)==s.charAt(r); l--,r++) result[l] = Math.min(result[l],1+result[r+1]);
            for(int l=i,r=i+1; l>=0 && r<s.length() && s.charAt(l)==s.charAt(r); l--,r++) result[l] = Math.min(result[l],1+result[r+1]);
        }
        return result[0];
    }
}
