package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3Test {

    private static _3 task;

    @BeforeEach
    public void setup() {
        task = new _3();
    }

    @Test
    void lengthOfLongestSubstring() {
        assertThat(task.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
        assertThat(task.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
        assertThat(task.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }
}