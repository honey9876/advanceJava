package LinkList;

public class delete {
    public static boolean hasCycle(ListNode head){
        ListNode slow = head, fast = head;
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast)  {
            return true;
        }
        return false;
    }
   
}
