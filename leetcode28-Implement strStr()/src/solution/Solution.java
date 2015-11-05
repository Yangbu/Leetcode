package solution;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int h=0;
        int n=0;
        int begin=0;
        while(begin<haystack.length() && haystack.length()-begin>=needle.length()  ){
            h=begin;
            while(n<needle.length()){
                if(haystack.charAt(h) != needle.charAt(n)){
                    n=0;
                    break;
                }
                n++;
                h++;
                
            }
            if(n==needle.length()) return begin;
            begin++;
        }
        return -1;
    }
}
