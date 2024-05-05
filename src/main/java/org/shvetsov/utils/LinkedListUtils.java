package org.shvetsov.utils;

import org.shvetsov.classes.ListNode;

import java.util.List;

public final class LinkedListUtils {

    private LinkedListUtils() {
    }

    public static ListNode constructListNode(int... array) {
        if (array == null || array.length == 0) {
            return new ListNode();
        }

        ListNode head = null;
        for (int i = array.length - 1; i >= 0; i--) {
            head = new ListNode(array[i], head);
        }
        return head;
    }

    public static ListNode constructListNode(List<Integer> array) {
        if (array == null || array.isEmpty()) {
            return new ListNode();
        }

        ListNode head = null;
        for (int i = array.size() - 1; i >= 0; i--) {
            head = new ListNode(array.get(i), head);
        }
        return head;
    }

    public static void prettyPrintLinkedList(ListNode node) {
        while (node != null && node.next != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        if (node != null) {
            System.out.println(node.val);
        } else {
            System.out.println("Empty LinkedList");
        }
    }

    public static ListNode getNodeByIndex(ListNode head, int i) {
        ListNode node = head;
        while (i > 0 && node != null) {
            node = node.next;
            i--;
        }
        return node;
    }
}
