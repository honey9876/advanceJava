package DailyprovelempartTwo;
public class SortList {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = findMiddle(head);
                ListNode right = sortList(mid.next);
                mid.next = null;
                ListNode left = sortList(head);
                return merge(left, right);
                            }
                        
   private static ListNode merge(ListNode left, ListNode right) {                    
      throw new UnsupportedOperationException("Unimplemented method 'merge'");
                    }
                
  private static ListNode findMiddle(ListNode head) {
                throw new UnsupportedOperationException("Unimplemented method 'findMiddle'");
            }
}
