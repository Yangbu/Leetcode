package solution;

import java.util.Stack;

/*
 * I have one input stack, onto which I push the incoming elements, and one output stack,
 *  from which I peek/pop. I move elements from input stack to output stack when needed, 
 *  i.e., when I need to peek/pop but the output stack is empty. When that happens,
 *   I move all elements from input to output stack, thereby reversing the order so 
 *   it's the correct order for peek/pop.

The loop in peek does the moving from input to output stack. Each element only ever gets
 moved like that once, though, and only after we already spent time pushing it, 
 so the overall amortized cost for each operation is O(1)
 * 
 * 
 * 
 */

class MyQueue {

    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        output.pop();
        
    }

    // Get the front element.
    public int peek() {
        if(output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return input.empty() && output.empty();
        
    }
}
