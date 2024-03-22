package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _234Test {

    private static _234 task;

    @BeforeEach
    public void setup() {
        task = new _234();
    }
    @Test
    void isPalindrome() {
        assertThat(task.isPalindrome(LinkedListUtils.constructListNode(1, 2, 2, 1))).isTrue();
        assertThat(task.isPalindrome(LinkedListUtils.constructListNode(1, 2))).isFalse();
    }
}