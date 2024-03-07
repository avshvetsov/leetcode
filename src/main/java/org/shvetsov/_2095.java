package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2095,
        name = "Delete the Middle Node of a Linked List",
        level = Level.MEDIUM,
        tags = {"Linked List", "Two Pointers"}
)
public class _2095 {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode preMiddle = head;
        ListNode current = head.next.next;
        while (current != null && current.next != null) {
            preMiddle = preMiddle.next;
            current = current.next.next;
        }
        preMiddle.next = preMiddle.next.next;
        return head;
    }
}