package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2181,
        name = "Merge Nodes in Between Zeros",
        level = Level.MEDIUM,
        tags = {"Linked List", "Simulation"}
)
public class _2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode();
        ListNode resCurr = res;
        ListNode curr = head;
        int counter = 0;
        do {
            if (curr.val != 0) {
                counter += curr.val;
            } else {
                if (counter > 0) {
                    resCurr.next = new ListNode();
                    resCurr = resCurr.next;
                    resCurr.val = counter;
                    counter = 0;
                }
            }
            curr = curr.next;
        } while (curr != null);
        return res.next;
    }
}