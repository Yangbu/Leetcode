package solution;

public class Solution {
    public int numDistinct(String s, String t) {
        int[][] result = new int[t.length()+1][s.length()+1];
        for(int i=0; i<result[0].length; i++){
            result[0][i]=1;
        }
        
        for(int i=0; i<t.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(t.charAt(i)==s.charAt(j)){
                    result[i+1][j+1] = result[i][j] + result[i+1][j];
                }else{
                    result[i+1][j+1] = result[i+1][j];
                }
            }
        }
        return result[t.length()][s.length()];
    }
}
