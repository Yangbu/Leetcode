package solution;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int res = 0;
        int newInt = x;
        int lastDigit = 0;
        while(newInt != 0 ){
            lastDigit = newInt%10;
            newInt/=10;
            res = 10*res + lastDigit;
        }
        return x==res;
    }
}
