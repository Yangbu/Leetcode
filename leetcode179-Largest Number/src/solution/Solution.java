package solution;

public class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";
        String[] result = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i]+"";
        }
        Comparator<String> com = new Comparator<String>(){
          public int compare(String s1, String s2){
              String r1 = s1+s2;
              String r2 = s2+s1;
              return r1.compareTo(r2);
          }  
        };
        Arrays.sort(result,com);
        if(result[result.length-1].charAt(0)=='0') return "0";
        StringBuilder re = new StringBuilder();
        for(String s: result){
            re.insert(0,s);
        }
        return re.toString();
    }
}
