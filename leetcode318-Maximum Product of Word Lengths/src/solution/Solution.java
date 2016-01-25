package solution;

import java.util.*;

public class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        Arrays.sort(words,new Comparator<String>(){
            public int compare(String a, String b){
                return b.length()-a.length();
            }
        });
        int[] digitForm = new int[words.length];
        for(int i=0; i<digitForm.length; i++){
            for(char c:words[i].toCharArray()){
                digitForm[i] |= 1<<(c-'a');
            }
        }
        for(int i=0; i<digitForm.length; i++){
            if(words[i].length()*words[i].length()<=max) break;
            for(int j=i+1; j<digitForm.length; j++){
                if((digitForm[i] & digitForm[j]) == 0){
                    max = Math.max(max,words[i].length()*words[j].length());
                    break;
                }
            }
        }
        return max;
    }
}
