package solution;

public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==0) return digits;
        return helper(digits,digits.length-1);
    }
    public int[] helper(int[] digits, int index){
        if(digits[index]<9){
            digits[index]++;
            return digits;
        }else if(index!=0){
            digits[index]=0;
            return helper(digits,index-1);
        }else{
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;
            
        }
    }
}
