package solution;

public class Solution {
    public boolean isNumber(String s) {
        String s1 = s.trim();
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)>='0'&&s1.charAt(i)<='9'){
                numberSeen = true;
                numberAfterE = true;
            }else if(s1.charAt(i)=='.'){
                if(pointSeen || eSeen){
                    return false;
                }
                pointSeen = true;
            }else if(s1.charAt(i)=='e'){
                if(eSeen || !numberSeen){
                    return false;
                }
                eSeen = true;
                numberAfterE = false;
            }else if(s1.charAt(i)=='-' || s1.charAt(i)=='+'){
                if(i!=0 && s1.charAt(i-1)!='e' ){
                    return false;
                }
            }else{
                return false;
            }
        }
        return numberSeen && numberAfterE;
    }
}
