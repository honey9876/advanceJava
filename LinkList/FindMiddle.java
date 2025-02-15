package LinkList;

public class FindMiddle {
    public static ListNode fListNodeMiddle(ListNode head){
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
       return slow;
    }
}
