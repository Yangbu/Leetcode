package solution;

/*
 * use two pointer(one for number, one for sign) to traversal from the start
 * each sign is combined with the next number
 * 
 */

import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        if(s == null || s.length() ==0) return 0;
        int num=0;
        char sign = '+';
        int result =0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = 10*num + s.charAt(i) - '0';
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length()-1){
                if(sign == '+'){
                    stack.push(num);
                }
                if(sign == '-'){
                    stack.push(-num);
                }
                if(sign == '*'){
                    stack.push(stack.pop()*num);
                }
                if(sign == '/'){
                    stack.push(stack.pop()/num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        for(int i : stack){
            result += i;
        }
        return result;
    }
}
