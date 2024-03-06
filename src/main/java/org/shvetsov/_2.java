package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 2,
        name = "Add Two Numbers",
        level = Level.MEDIUM,
        tags = {"Linked List", "Math", "Recursion"}
)
public class _2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        ListNode res = null;
        int add = 0;
        while (l1 != null && l2 != null) {
            list.add((l1.val + l2.val + add) % 10);
            add = (l1.val + l2.val + add) > 9 ? 1 : 0;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            list.add((l1.val + add) % 10);
            add = (l1.val + add) > 9 ? 1 : 0;
            l1 = l1.next;
        }
        while (l2 != null) {
            list.add((l2.val + add) % 10);
            add = (l2.val + add) > 9 ? 1 : 0;
            l2 = l2.next;
        }
        while (add != 0) {
            list.add(add % 10);
            add = 0;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            res = new ListNode(list.get(i), res);
        }
        return res;
    }

}
