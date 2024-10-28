public class Leet02 {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode pre = new ListNode(0); //固定记录cur的开头
            ListNode cur = pre;
            int carry = 0; //进位
            while (l1 != null || l2 != null) {
                int l1Val = l1 == null ? 0 : l1.val;
                int l2Val = l2 == null ? 0 : l2.val;
                int sum = l1Val + l2Val + carry;
                carry = sum / 10;
                sum = sum % 10;
                cur.next = new ListNode(sum);
                cur = cur.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if(carry == 1){
                cur.next = new ListNode(1);
            }
            return pre.next;

        }
    }
}
