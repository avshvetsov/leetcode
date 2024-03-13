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

}
