package solution;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator == 0) return "NaN";
        if(numerator == 0) return "0";
        Long n = new Long(numerator);
        Long d = new Long(denominator);
        StringBuilder result = new StringBuilder();
        if(n*d<0) result.append("-");
        n = Math.abs(n);
        d = Math.abs(d);
        result.append(n/d + "");
        if(n%d == 0) return result.toString();
        result.append(".");
        long r = n%d;
        Map<Long,Integer> map = new HashMap<>();
        while(r > 0){
            if(map.containsKey(r)){
                result.insert(map.get(r),"(");
                result.append(")");
                break;
            }else{
                map.put(r,result.length());
                r *= 10;
                result.append(r/d+"");
                r = r%d;
            }
        }
        return result.toString();
    }
}
