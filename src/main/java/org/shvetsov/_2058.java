package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 2058,
        name = "Find the Minimum and Maximum Number of Nodes Between Critical Points",
        level = Level.MEDIUM,
        tags = {"Linked List"}
)
public class _2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode next;
        int pos = 1;
        int firstCP = -1;
        int lastCP = -1;
        int min = Integer.MAX_VALUE;
        while (cur != null) {
            next = cur.next;
            if (next != null && ((cur.val > prev.val && cur.val > next.val) || (cur.val < prev.val && cur.val < next.val))) {
                if (firstCP == -1) firstCP = pos;
                if (lastCP != -1) {
                    min = Math.min(min, pos - lastCP);
                }
                lastCP = pos;
            }
            prev = cur;
            cur = cur.next;
            pos++;
        }
        if (firstCP == -1 || firstCP == lastCP) return new int[]{-1, -1};
        return new int[]{min, lastCP - firstCP};
    }

    public static class withListOfCP {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            List<Integer> cp = new ArrayList<>();
            ListNode prev = head;
            ListNode cur = head.next;
            ListNode next;
            int pos = 1;
            while (cur != null) {
                next = cur.next;
                if (next != null && ((cur.val > prev.val && cur.val > next.val) || (cur.val < prev.val && cur.val < next.val))) {
                    cp.add(pos);
                }
                prev = cur;
                cur = cur.next;
                pos++;
            }

            if (cp.size() < 2) return new int[]{-1, -1};
            int min = Integer.MAX_VALUE;
            int max = cp.getLast() - cp.getFirst();
            for (int i = 1; i < cp.size(); i++) {
                min = Math.min(min, cp.get(i) - cp.get(i - 1));
            }
            return new int[]{min, max};
        }


    }

}