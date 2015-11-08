package solution;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<candidates.length; i++){
            if(target<candidates[i]){
                break;
            }else if(target==candidates[i]){
                List<Integer> list = new ArrayList<>();
                list.add(candidates[i]);
                result.add(list);
            }else{
                int[] restArray = Arrays.copyOfRange(candidates,i,candidates.length);
                List<List<Integer>> temp = combinationSum(restArray,target-candidates[i]);
                
                for(List<Integer> l : temp){
                    l.add(0,candidates[i]);
                    result.add(l);
                }
            }
        }
        return result;
    }
}
