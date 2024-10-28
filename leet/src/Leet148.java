public class Leet148 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode temp = slow.next;
            slow.next = null; //切断
            ListNode left = sortList(head);
            ListNode right = sortList(temp);
            ListNode pre = new ListNode(0);
            ListNode cur = pre;
            while (left != null && right != null) {
                if(left.val < right.val) {
                    pre.next = left;
                    left = left.next;
                }else {
                    pre.next = right;
                    right = right.next;
                }
                pre = pre.next;
            }
            pre.next = left == null ? right : left;
            return cur.next;


        }
    }
}
