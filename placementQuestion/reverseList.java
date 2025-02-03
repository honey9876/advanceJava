package placementQuestion;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){ val = x;}
}

public class reverseList {
    public static ListNode reverListNode(ListNode head){
        ListNode prev = null;
        ListNode curr= head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
     return prev;

    }
    
}
