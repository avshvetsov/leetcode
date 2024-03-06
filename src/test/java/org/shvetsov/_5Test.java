package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _5Test {

    private static _5 task;

    @BeforeEach
    public void setup() {
        task = new _5();
    }

    @Test
    void longestPalindrome() {
        assertThat(task.longestPalindrome("babad")).isEqualTo("bab");
        assertThat(task.longestPalindrome("cbbd")).isEqualTo("bb");
    }
}