package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1669,
        name = "Merge In Between Linked Lists",
        level = Level.MEDIUM,
        tags = {"Linked List"}
)
public class _1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current = new ListNode(0, list1);
        for (int i = 0; i < a; i++) {
            current = current.next;
        }
        ListNode old = current.next;
        current.next = list2;
        current = current.next;
        while (current.next != null) {
            current = current.next;
        }
        for (int i = a; i <= b; i++) {
            old = old.next;
        }
        current.next = old;
        return list1;
    }
}