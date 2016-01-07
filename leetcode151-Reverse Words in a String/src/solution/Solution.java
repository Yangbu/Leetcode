package solution;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder("");
        if(words.length > 0){
            for(int i=words.length-1; i>0; i--){
                result.append(words[i]+" ");
            }
            result.append(words[0]);
        }
        return result.toString();
    }
}
