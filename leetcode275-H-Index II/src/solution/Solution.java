package solution;

public class Solution {
    public int hIndex(int[] citations) {
        int h =0;
        if(citations==null) return h;
        for(int i = citations.length-1; i>=0 && citations[i] >= (citations.length - i); i--){
            h = citations.length - i;
        }
        return h;
    }
}