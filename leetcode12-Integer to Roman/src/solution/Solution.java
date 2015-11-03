package solution;

public class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        String[] G = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] S = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] B = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        
        int q = num/1000;
        int b = (num%1000)/100;
        int s = (num%100)/10;
        int g = num%10;
        
        for(int i = q; i>0;i--){
            result.append("M");
        }
        result.append(B[b]);
        result.append(S[s]);
        result.append(G[g]);
        
        return result.toString();
    }
}
