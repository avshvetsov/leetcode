package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2816,
        name = "Double a Number Represented as a Linked List",
        level = Level.MEDIUM,
        tags = {"Linked List", "Math", "Stack"}
)
public class _2816 {
    public ListNode doubleIt(ListNode head) {
        //reverse
        ListNode prev = null, next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        //construct
        ListNode res = null;
        int add = 0;
        while (prev != null) {
            res = new ListNode((prev.val * 2) % 10 + add, res);
            add = (prev.val * 2) / 10;
            prev = prev.next;
        }
        if (add > 0) {
            res = new ListNode(add, res);
        }
        return res;
    }
}