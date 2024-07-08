package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1823,
        name = "Find the Winner of the Circular Game",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Recursion", "Queue", "Simulation"}
)
public class _1823 {
    public int findTheWinner(int n, int k) {
        //build circular list
        ListNode head = new ListNode(1);
        ListNode cur = head;
        while (cur.val < n) {
            cur.next = new ListNode(cur.val + 1);
            cur = cur.next;
        }
        cur.next = head;

        //simulate process
        int i = 1;
        while (head.next != head) {
            if (i == k) {
                cur.next = head.next;
                head = head.next;
                i = 1;
            } else {
                cur = head;
                head = head.next;
                i++;
            }
        }
        return head.val;
    }
}