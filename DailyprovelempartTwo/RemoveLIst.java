package DailyprovelempartTwo;

public class RemoveLIst {
    public static ListNode removeNthfromate(ListNode head, int n){
        ListNode dummy = new ListNode(n);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        for(int i = 0; i<= n; i++){
            fast = fast.next;

        }

        while  (fast != null) {
             slow = slow.next;
             fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    
}
