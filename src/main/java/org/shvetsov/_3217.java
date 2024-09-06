package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 3217,
        name = "Delete Nodes From Linked List Present in Array",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Linked List"}
)
public class _3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(head.val)) {
            head = head.next;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while (next != null) {
            if (set.contains(curr.val)) {
                prev.next = next;
                curr = next;
                next = next.next;
            } else {
                prev = curr;
                curr = next;
                next = next.next;
            }
        }
        if (set.contains(curr.val)) {
            prev.next = null;
        }
        return head;
    }
}