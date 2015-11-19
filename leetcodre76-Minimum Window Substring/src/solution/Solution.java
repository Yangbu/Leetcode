package solution;

public class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0) return "";
        int[] charS = new int[128];
        int[] charT = new int[128];
        int found=0;
        int min = Integer.MAX_VALUE;
        int start=0;
        int j=0;
        String result="";
        for(int i=0; i<t.length(); i++){
            charT[t.charAt(i)]++;
        }
        while(j<s.length()){
            if(charT[s.charAt(j)]>0){
                charS[s.charAt(j)]++;
                if(charS[s.charAt(j)]<=charT[s.charAt(j)]){
                    found++;
                }
            }
            j++;
            while(found==t.length()){
                if(j-start<min){
                    min = j-start;
                    result = s.substring(start,j);
                }
                if(charT[s.charAt(start)]>0){
                    charS[s.charAt(start)]--;
                    if(charS[s.charAt(start)]<charT[s.charAt(start)]) found--;
                }
                start++;
            }
        }
        return result;
    }
}
