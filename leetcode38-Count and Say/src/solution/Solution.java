package solution;

public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for(int i=1; i<n; i++){
            String previous  =result;
            result="";
            int count=1;
            char say = previous.charAt(0);
            for(int j=1; j<previous.length(); j++){
                if(say != previous.charAt(j)){
                    result = result+count+say;
                    say = previous.charAt(j);
                    count=1;
                    
                }else{
                    count++;
                }
            }
            result = result+count+say;
        }
        return result;
    }
}
