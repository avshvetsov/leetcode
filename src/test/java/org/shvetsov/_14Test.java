package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _14Test {

    private static _14 task;

    @BeforeEach
    public void setup() {
        task = new _14();
    }

    @Test
    void longestCommonPrefix() {
        assertThat(task.longestCommonPrefix(new String[]{"flower","flow","flight"})).isEqualTo("fl");
        assertThat(task.longestCommonPrefix(new String[]{"dog","racecar","car"})).isEqualTo("");
    }
}