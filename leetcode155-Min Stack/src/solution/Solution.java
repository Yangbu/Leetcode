package solution;

public class Solution {
    long min;
    Stack<Long> stack;
    public MinStack(){
        stack = new Stack<Long>();
    }
    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = x;
        }else{
            stack.push(x-min);
            if(x<min) min = x;
        }
    }

    public void pop() {
        if(stack.isEmpty()) return;
        long top = stack.pop();
        if(top<0) min = min - top;
    }

    public int top() {
        long top = stack.peek();
        return top>0? (int)(min+top) : (int)min;
    }

    public int getMin() {
        return (int)min;
    }
}
