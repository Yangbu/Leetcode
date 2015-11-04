package solution;

import java.util.Deque;
import java.util.LinkedList;


public class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return false;
        Deque<Character> temp = new LinkedList<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                temp.push(s.charAt(i));
                
            }else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if(temp.isEmpty())return false;
                char cur = temp.pop();
                switch(s.charAt(i)){
                    case ')':{
                        if(cur != '('){
                            return false;
                        }
                        break;
                    }
                    case '}':{
                        if(cur != '{'){
                            return false;
                        }
                        break;
                    }
                    case ']':{
                        if(cur != '['){
                            return false;
                        }
                        break;
                    }
                }
                
            }else{
                return false;
            }
        }
        return temp.isEmpty();
    }
}
