package solution;

public class Solution {
    public int myAtoi(String str) {
        if(str.length()==0 || str == null){
            return 0;
        }
        str=str.trim();
        int flag = 1;
        int i=0;
        if(str.charAt(i) == '+'){
            i++;
        }else if(str.charAt(i) == '-'){
            flag = -1;
            i++;
        }
        
        double res = 0;
        while(i<str.length() && str.charAt(i)-'0' >=0 && str.charAt(i)-'0' <=9){
            res = res*10 + (str.charAt(i)-'0');
            i++;
        }
        res *= flag;
        if(res>=Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(res<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)res;
    }
}
