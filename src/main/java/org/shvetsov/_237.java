package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 237,
        name = "Delete Node in a Linked List",
        level = Level.MEDIUM,
        tags = {"Linked List"}
)
public class _237 {
    public void deleteNode(ListNode head, ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}