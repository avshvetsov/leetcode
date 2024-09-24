package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3043Test {

    private static _3043 task;

    @BeforeEach
    public void setup() {
        task = new _3043();
    }

    @Test
    void longestCommonPrefixExample1() {
        assertThat(task.longestCommonPrefix(new int[]{1, 10, 100}, new int[]{1000})).isEqualTo(3);
    }

    @Test
    void longestCommonPrefixExample2() {
        assertThat(task.longestCommonPrefix(new int[]{1, 2, 100}, new int[]{4, 4, 4})).isEqualTo(0);
    }
}