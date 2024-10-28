import java.util.HashSet;

public class Leet142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head == null || head.next == null) return null;
            HashSet<ListNode> sets = new HashSet<>();
            ListNode curr = head;
            while (curr != null) {
                if (sets.contains(curr)) {
                    return curr;
                }
                sets.add(curr);
                curr = curr.next;
            }
            return null;

        }
    }
}
