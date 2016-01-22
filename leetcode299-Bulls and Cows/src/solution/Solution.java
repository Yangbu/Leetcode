package solution;

public class Solution {
    public String getHint(String secret, String guess) {
        int[] num = new int[10];
        int bulls=0, cows=0;
        for(int i=0; i<secret.length(); i++){
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s==g) bulls++;
            else{
                if(num[s]<0) cows++;
                if(num[g]>0) cows++;
                num[s]++;
                num[g]--;
            }
        }
        return bulls+"A"+cows+"B";
    }
}
