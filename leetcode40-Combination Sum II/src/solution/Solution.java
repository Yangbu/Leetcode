package solution;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<candidates.length; i++){
            if(i>0 && candidates[i]==candidates[i-1]) continue;
            if(target<candidates[i]){
                break;
            }else if(target==candidates[i]){
                List<Integer> list = new ArrayList<>();
                list.add(candidates[i]);
                result.add(list);
            }else{
                int[] restArray = Arrays.copyOfRange(candidates,i+1,candidates.length);
                List<List<Integer>> temp = combinationSum2(restArray,target-candidates[i]);
                
                for(List<Integer> l : temp){
                    l.add(0,candidates[i]);
                    result.add(l);
                }
            }
        }
        return result;
    }
}
