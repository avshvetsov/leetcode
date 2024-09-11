package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2807,
        name = "Insert Greatest Common Divisors in Linked List",
        level = Level.MEDIUM,
        tags = {"Linked List", "Math", "Number Theory"}
)
public class _2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode next = head.next;
        while (next != null) {
            ListNode curr = new ListNode(gcd(prev.val, next.val));
            prev.next = curr;
            curr.next = next;
            prev = next;
            next = next.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int gcdBruteForce(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            for (int i = min; i > 0; i--) {
                if (min % i == 0 && max % i == 0) {
                    return i;
                }
            }
            return 1;
        }
    }

    private int gcdApache(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            int aTwos = Integer.numberOfTrailingZeros(a);
            a >>= aTwos;
            int bTwos = Integer.numberOfTrailingZeros(b);
            b >>= bTwos;

            int shift;
            for (shift = Math.min(aTwos, bTwos); a != b; a >>= Integer.numberOfTrailingZeros(a)) {
                int delta = a - b;
                b = Math.min(a, b);
                a = Math.abs(delta);
            }

            return a << shift;
        }
    }
}