package solution;



public class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> set = new HashSet<>(Arrays.asList("",".",".."));
        String[] s = path.split("/");
        for(String part : s){
            if(part.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!set.contains(part)){
                stack.push(part);
            }
        }
        String result ="";
        for(String st : stack){
            result = "/"+st+result;
        }
        return result.length()==0? "/":result;
    }
}
