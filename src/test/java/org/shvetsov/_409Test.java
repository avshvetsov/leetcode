package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _409Test {

    private static _409 task;

    @BeforeEach
    public void setup() {
        task = new _409();
    }

    @Test
    void longestPalindromeExample1() {
        assertThat(task.longestPalindrome("abccccdd")).isEqualTo(7);
    }

    @Test
    void longestPalindromeExample2() {
        assertThat(task.longestPalindrome("a")).isEqualTo(1);
    }
}