package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2000Test {

    private static _2000 task;

    @BeforeEach
    public void setup() {
        task = new _2000();
    }

    @Test
    void reversePrefix() {
        assertThat(task.reversePrefix("abcdefd", 'd')).isEqualTo("dcbaefd");
        assertThat(task.reversePrefix("xyxzxe", 'z')).isEqualTo("zxyxxe");
        assertThat(task.reversePrefix("abcd", 'z')).isEqualTo("abcd");
    }
}