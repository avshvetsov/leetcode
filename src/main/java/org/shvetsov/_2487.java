package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Stack;

@LeetCode(
        number = 2487,
        name = "Remove Nodes From Linked List",
        level = Level.MEDIUM,
        tags = {"Linked List", "Stack", "Recursion", "Monotonic Stack"}
)
public class _2487 {
    public ListNode removeNodes(ListNode head) {
        //reverse current head
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            head = curr;
            curr = curr.next;
            head.next = prev;
            prev = head;
        }
        //construct result
        ListNode res = null;
        while (head != null) {
            if (res == null || res.val <= head.val) {
                res = new ListNode(head.val, res);
            }
            head = head.next;
        }
        return res;
    }

    public ListNode removeNodesWithStack(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            ListNode curr = stack.pop();
            if (head == null || curr.val >= head.val) {
                head = new ListNode(curr.val, head);
            }
        }
        return head;
    }


    public ListNode removeNodesNotEfficient(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            while (!stack.isEmpty() && stack.peek().val < head.val) {
                stack.pop();
            }
            stack.push(new ListNode(head.val));
            head = head.next;
        }
        while (!stack.isEmpty()) {
            ListNode curr = stack.pop();
            head = new ListNode(curr.val, head);
        }
        return head;
    }

}