package solution;

public class Solution {
    public static int jump(int[] nums) {
        int count =0 , max = 0;
        for(int i=0, nextMax =0; i <=max && i< nums.length -1 ; i++){
            nextMax = Math.max(nextMax, i + nums[i]);
            
            if(i == max){
                max = nextMax;
                count++;
            }
        }
       return max >= nums.length -1 ? count: -1; 
    }
    public static void main(String[] args) {
		int[] a = {2,1};
		System.out.println(jump(a));
	}
}
