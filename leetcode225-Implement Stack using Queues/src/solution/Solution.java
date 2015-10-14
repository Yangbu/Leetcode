package solution;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        queue.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        for(int i=1; i<queue.size(); i++){
            queue.offer(queue.poll());
        }
        queue.poll();
    }

    // Get the top element.
    public int top() {
        for(int i=1; i<queue.size(); i++){
            queue.offer(queue.poll());
        }
        int r=queue.poll();
        queue.offer(r);
        return r;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
