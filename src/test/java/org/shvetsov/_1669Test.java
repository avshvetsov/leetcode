package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.classes.ListNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.LinkedListUtils.constructListNode;

class _1669Test {

    private _1669 task;

    @BeforeEach
    public void setup() {
        task = new _1669();
    }

    @Test
    void mergeInBetween1() {
        ListNode list1 = constructListNode(10, 1, 13, 6, 9, 5);
        ListNode list2 = constructListNode(1000000, 1000001, 1000002);
        ListNode expected = constructListNode(10, 1, 13, 1000000, 1000001, 1000002, 5);
        assertThat(task.mergeInBetween(list1, 3, 4, list2)).isEqualTo(expected);
    }

    @Test
    void mergeInBetween2() {
        ListNode list1 = constructListNode(0, 1, 2, 3, 4, 5, 6);
        ListNode list2 = constructListNode(1000000, 1000001, 1000002, 1000003, 1000004);
        ListNode expected = constructListNode(0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6);
        assertThat(task.mergeInBetween(list1, 2, 5, list2)).isEqualTo(expected);
    }
}