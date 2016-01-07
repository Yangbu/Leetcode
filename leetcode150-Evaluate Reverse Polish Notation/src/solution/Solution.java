package solution;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();
        int num1, num2;
        for(int i=0; i<tokens.length; i++){
            switch(tokens[i]){
                case "+":
                    num1 = result.pop();
                    num2 = result.pop();
                    result.push(num1+num2);
                    continue;
                case "-":
                    num1 = result.pop();
                    num2 = result.pop();
                    result.push(num2-num1);
                    continue;
                case "*":
                    num1 = result.pop();
                    num2 = result.pop();
                    result.push(num1*num2);
                    continue;
                case "/":
                    num1 = result.pop();
                    num2 = result.pop();
                    result.push(num2/num1);
                    continue;
                default:
                    result.push(Integer.parseInt(tokens[i]));
                    
            }
        }
                    return result.pop();
    }
}
