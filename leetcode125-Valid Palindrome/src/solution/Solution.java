package solution;

public class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int i = 0, j = s.length() - 1;
        while(i<=j){
            char cHead = s.charAt(i);
            char cEnd = s.charAt(j);
            if(!Character.isLetterOrDigit(cHead)){
                i++;
            }else if(!Character.isLetterOrDigit(cEnd)){
                j--;
            }else if(Character.toLowerCase(cHead) != Character.toLowerCase(cEnd)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
