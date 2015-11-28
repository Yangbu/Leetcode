package solution;

public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) return false;
        boolean[][] result = new boolean[s1.length()+1][s2.length()+1];
        result[0][0] = true;
        for(int i=1; i<result.length; i++){
            result[i][0] = result[i-1][0] && s1.charAt(i-1)==s3.charAt(i-1);
        }
        for(int j=1; j<result[0].length; j++){
            result[0][j] = result[0][j-1] && s2.charAt(j-1)==s3.charAt(j-1);
        }
        for(int i=1; i<result.length; i++){
            for(int j=1; j<result[0].length; j++){
                result[i][j] = (result[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1))|| (result[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1));
            }
        }
        return result[s1.length()][s2.length()];
    }
}
