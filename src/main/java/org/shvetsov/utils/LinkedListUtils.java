package org.shvetsov.utils;

import org.shvetsov.classes.ListNode;

public class LinkedListUtils {

    public static ListNode constructListNode(int... array) {
        if (array == null || array.length == 0) {
            return new ListNode();
        }

        ListNode head = null;
        for (int i = 0; i < array.length; i++) {
            head = new ListNode(array[i], head);
        }
        return head;
    }

}
