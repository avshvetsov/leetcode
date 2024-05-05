package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.classes.ListNode;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _237Test {

    private static _237 task;

    @BeforeEach
    public void setup() {
        task = new _237();
    }

    @Test
    void deleteNode1() {
        ListNode head = LinkedListUtils.constructListNode(4, 5, 1, 9);
        ListNode node = LinkedListUtils.getNodeByIndex(head, 1);
        task.deleteNode(head, node);
        assertThat(head).isEqualTo(LinkedListUtils.constructListNode(4, 1, 9));
    }

    @Test
    void deleteNode2() {
        ListNode head = LinkedListUtils.constructListNode(4, 5, 1, 9);
        ListNode node = LinkedListUtils.getNodeByIndex(head, 2);
        task.deleteNode(head, node);
        assertThat(head).isEqualTo(LinkedListUtils.constructListNode(4, 5, 9));
    }
}