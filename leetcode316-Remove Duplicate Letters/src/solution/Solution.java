package solution;

public class Solution {
    public String removeDuplicateLetters(String s) {
        int[] letters = new int[26];
        for(int i=0; i<s.length(); i++){
            letters[s.charAt(i)-'a']++;
        }
        int start = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<s.charAt(start)) start = i;
            if(--letters[s.charAt(i)-'a'] == 0) break;
        }
        return s.length()==0? "":s.charAt(start)+removeDuplicateLetters(s.substring(start).replaceAll(""+s.charAt(start),""))+"";
    }
}
