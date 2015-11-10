package solution;
/*
 * http://yucoding.blogspot.com/2013/02/leetcode-question-123-wildcard-matching.html
 */

public class Solution {
    public boolean isMatch(String s, String p) {
        int sIdx = 0; int pIdx = 0;
        int starIdx = -1;
        int match = 0;
        while(sIdx<s.length()){
            if(pIdx<p.length() && (p.charAt(pIdx)=='?' || p.charAt(pIdx)==s.charAt(sIdx))){
                sIdx++;
                pIdx++;
            }else if(pIdx<p.length() && p.charAt(pIdx)=='*'){
                starIdx = pIdx;
                match = sIdx;
                pIdx++;
            }else if(starIdx != -1){
                pIdx = starIdx+1;
                match++;
                sIdx = match;
                
            }else{
                return false;
            }
        }
        
        while(pIdx<p.length() && p.charAt(pIdx)=='*'){
           pIdx++;
        }
        return pIdx==p.length();
    }
}
