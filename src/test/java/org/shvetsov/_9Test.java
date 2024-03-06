package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _9Test {

    private static _9 task;

    @BeforeEach
    public void setup() {
        task = new _9();
    }

    @Test
    void isPalindrome() {
        assertThat(task.isPalindrome(121)).isTrue();
        assertThat(task.isPalindrome(-121)).isFalse();
        assertThat(task.isPalindrome(10)).isFalse();
    }
}