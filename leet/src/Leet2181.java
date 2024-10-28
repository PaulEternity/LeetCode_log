public class Leet2181 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
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
        public ListNode mergeNodes(ListNode head) {
            ListNode tail = head;
            for(ListNode cur = head.next; cur != null; cur = cur.next){
                if(cur.val != 0){
                    tail.val += cur.val;
                }
                else {
                    tail = tail.next;
                    tail.val = 0;
                }
            }
            tail.next = null;
            return head;

        }
    }
}
