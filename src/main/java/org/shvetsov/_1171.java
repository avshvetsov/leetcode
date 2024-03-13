package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1171,
        name = "Remove Zero Sum Consecutive Nodes from Linked List",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Linked List"}
)
public class _1171 {

    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        int sum = 0;
        while (curr != null) {
            sum += curr.val;
            if (sum == 0) {
                return removeZeroSumSublists(curr.next);
            }
            curr = curr.next;
        }
        head.next = removeZeroSumSublists(head.next);
        return head;
    }


    public ListNode removeZeroSumSublistsInefficient(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode curr = head;
        int sum = 0;
        while (curr != null) {
            sum += curr.val;
            if (sum == 0) {
                map.clear();
                head = curr.next;
            } else {
                if (map.containsKey(sum)) {
                    map.get(sum).next = curr.next;
                    map.clear();
                    curr = head;
                    sum = 0;
                    continue;
                } else  map.put(sum, curr);
            }
            curr = curr.next;
        }
        return head;
    }


}