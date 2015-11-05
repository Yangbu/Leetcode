package solution;

public class Solution {
    ListNode cur = head;
    int count=0;
    while(cur!=null && count != k){
        cur  = cur.next;
        count++;
    }
    
    if(count == k){
        cur = reverseKGroup(cur,k);
        while(count-->0){
            ListNode next = head.next;
            head.next = cur;
            cur = head;
            head = next;
        }
        head = cur;
        
    }
    return head;
}
}
