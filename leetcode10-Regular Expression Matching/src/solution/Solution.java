package solution;

/*
 * "*" not appear alone, this come with the preceding element as a whole one element .

So ab*ac*a means a (b*) a (c*) a.
 */

public class Solution {
    public boolean isMatch(String s, String p) {
        if(p.contains(".") || p.contains("*")){
            if(p.length() == 1 || p.charAt(1)!='*'){
                return com(s,p,s.length(),0) && isMatch(s.substring(1),p.substring(1));
            }
            for(int i=0; i==0||com(s,p,s.length(),i-1);i++){
                if(isMatch(s.substring(i),p.substring(2))) return true;
            }
        }
            return s.equals(p);
    }
    public boolean com(String s, String p, int len , int i){
        return len>i && ((s.charAt(i) == p.charAt(0) )|| p.charAt(0)=='.');
    }
}
