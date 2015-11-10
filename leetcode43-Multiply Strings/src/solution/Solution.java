package solution;

public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] pro = new int[len1+len2];
        for(int i = len1-1;i>=0;i--){
            for(int j = len2 -1;j>=0;j--){
                int index = len1 +len2 -i - j -2;
                pro[index] += (num1.charAt(i) - '0')*(num2.charAt(j) - '0');
                pro[index+1] += pro[index]/10;
                pro[index] = pro[index]%10;
            }
            
        }
        StringBuilder result = new StringBuilder();
        for(int z = pro.length -1 ; z>0; z--){
            if(result.length()==0 && pro[z] == 0)
            continue;
            result.append(pro[z]);
        }
        result.append(pro[0]);
          return result.toString();  
    }
}
