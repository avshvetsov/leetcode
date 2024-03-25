package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 234,
        name = "Palindrome Linked List",
        level = Level.EASY,
        tags = {"Linked List", "Two Pointers", "Stack", "Recursion"}
)
public class _234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = list.size() - 1;
        boolean isPalindrome = true;
        while (r > l) {
            if (!list.get(l).equals(list.get(r))) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        return isPalindrome;
    }




    ListNode curr;

    public boolean isPalindromeRecursion(ListNode head) {
        curr = head;
        return recursionSolve(head);
    }

    private boolean recursionSolve(ListNode head) {
        if (head == null) {
            return true;
        }
        boolean ans = recursionSolve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }
}