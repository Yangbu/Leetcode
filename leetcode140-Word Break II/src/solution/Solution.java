package solution;

public class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new LinkedList<>();
        for(int i=s.length()-1; i>=0; i--){
            if(wordDict.contains(s.substring(i))) break;
            else{
              if(i==0) return result;  
            } 
        }
        for(int i=0; i<s.length(); i++){
            if(wordDict.contains(s.substring(0,i+1))){
                List<String> next = wordBreak(s.substring(i+1), wordDict);
                    if(next.size() != 0){
                        for(String s1 : next) result.add(s.substring(0,i+1)+" "+s1);
                    }
            }
        }
        if(wordDict.contains(s)) result.add(s);
        return result;
    }
}
