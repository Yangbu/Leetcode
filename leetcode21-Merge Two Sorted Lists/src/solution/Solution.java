package solution;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while(l1 != null || l2 != null){
            if(l1== null || (l2 !=null && l2.val<l1.val)){
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }else{
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
        }
        return result.next;
    }
}
