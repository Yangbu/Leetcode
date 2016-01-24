package solution;

public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1) return Collections.singletonList(0);
        List<Set<Integer>> set = new ArrayList<>();
        for(int i=0; i<n; i++) set.add(new HashSet<Integer>());
        for(int[] e:edges){
            set.get(e[0]).add(e[1]);
            set.get(e[1]).add(e[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for(int i=0; i<set.size(); i++){
            if(set.get(i).size()==1) leaves.add(i);
        }
        while(n>2){
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for(int l:leaves){
                int j = set.get(l).iterator().next();
                set.get(j).remove(l);
                if(set.get(j).size()==1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
