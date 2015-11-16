package solution;

public class Solution {
    public String addBinary(String a, String b) {
        if(a==null || a.length()==0) return b;
        if(b==null || b.length()==0) return a;
        int aBit;
        int bBit;
        int temp;
        int carry = 0;
        int i=a.length()-1, j = b.length()-1;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j >=0 || carry ==1){
            aBit = i>=0? a.charAt(i--)-'0':0;
            bBit = j>=0? b.charAt(j--)-'0':0;
            temp = aBit^bBit^carry;
            carry = aBit+bBit+carry >=2? 1:0;
            result.append(temp);
        }
        return result.reverse().toString();
    }
}
