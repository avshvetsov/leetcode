package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 206,
        name = "Reverse Linked List",
        level = Level.EASY,
        tags = {"Linked List", "Recursion"}
)
public class _206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode prev;
        while (next != null) {
            prev = head;
            head = next;
            next = head.next;
            head.next = prev;
        }
        return head;
    }

}