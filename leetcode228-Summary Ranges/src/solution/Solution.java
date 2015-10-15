package solution;

import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		Stack<Integer> stack2 = stack1;
		while(!stack2.isEmpty()){
			System.out.println(stack2.pop());
		}
	}

}
