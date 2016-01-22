package solution;

public class Solution {
    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for(int i=1; i<=(len-1)/2; i++){
            if(num.charAt(0)=='0' && i>=2) break;
            for(int j=i+1; len-j>=i && len-j>=j-i; j++){
                if(num.charAt(i)=='0' && j-i>=2) break;
                long n1 = Long.parseLong(num.substring(0,i));
                long n2 = Long.parseLong(num.substring(i,j));
                String rest = num.substring(j);
                if(helper(n1,n2,rest)) return true;
            }
        }
        return false;
    }
    public boolean helper(long n1, long n2, String rest){
        if(rest.equals("")) return true;
        long sum = n1+n2;
        if(!rest.startsWith(sum+"")) return false;
        return helper(n2,sum,rest.substring((sum+"").length()));
    }
}
