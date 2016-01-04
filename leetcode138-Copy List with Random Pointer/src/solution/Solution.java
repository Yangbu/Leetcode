package solution;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        RandomListNode next;
        while(cur != null){
            next = cur.next;
            RandomListNode copy = new RandomListNode(cur.label);
            cur.next = copy;
            copy.next = next;
            cur = next;
        }
        cur = head;
        while(cur != null){
            if(cur.random != null) cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        cur = head;
        RandomListNode result = new RandomListNode(0);
        RandomListNode temp = result;
        while(cur != null){
            temp.next = cur.next;
            cur.next = cur.next.next;
            temp = temp.next;
            cur = cur.next;
        }
        return result.next;
    }
}
