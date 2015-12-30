package solution;

public class Solution {
    public List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>>[] result = new List[len+1];
        result[0] = new LinkedList<List<String>>();
        result[0].add(new LinkedList<String>());
        boolean[][] isPal = new boolean[len][len];
        for(int i=0; i<len; i++){
            result[i+1] = new LinkedList<List<String>>();
            char c = s.charAt(i);
            for(int j=0; j<=i; j++){
                if(j==i) isPal[j][i] = true;
                else{
                    if(c != s.charAt(j)) continue;
                    if(j==i-1) isPal[j][i] = true;
                    else isPal[j][i] = isPal[j+1][i-1];
                }
                if(isPal[j][i]){
                    String s1 = s.substring(j,i+1);
                    for(List<String> l : result[j]){
                        List<String> l1 = new LinkedList<>(l);
                        l1.add(s1);
                        result[i+1].add(l1);
                    }
                }
            }
        }
        return result[len];
    }
}
