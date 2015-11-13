package solution;

public class Solution {
    public int lengthOfLastWord(String s) {
        String newS = s.trim();
        if(newS.length()==0) return 0;
        return newS.length() - newS.lastIndexOf(' ')-1;
    }
}
