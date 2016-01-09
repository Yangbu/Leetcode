package solution;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int len = Math.max(s1.length,s2.length);
        for(int i=0; i<len; i++){
            Integer v1 = i<s1.length ? Integer.parseInt(s1[i]) : 0;
            Integer v2 = i<s2.length ? Integer.parseInt(s2[i]) : 0;
            if(v1.compareTo(v2) != 0) return v1.compareTo(v2);
        }
        return 0;
    }
}
