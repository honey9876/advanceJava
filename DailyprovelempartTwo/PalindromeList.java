package DailyprovelempartTwo;

public class PalindromeList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode slow = head, fast = head, prev = null;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode revHead = reverse(slow);
        ListNode curr = head;

        while (revHead != null) {
            if (curr.val != revHead.val) return false;
            curr = curr.next;
            revHead = revHead.next;
        }

        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

