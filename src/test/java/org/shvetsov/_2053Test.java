package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2053Test {

    private static _2053 task;

    @BeforeEach
    public void setup() {
        task = new _2053();
    }

    @Test
    void kthDistinctExample1() {
        assertThat(task.kthDistinct(new String[]{"d", "b", "c", "b", "c", "a"}, 2)).isEqualTo("a");
    }

    @Test
    void kthDistinctExample2() {
        assertThat(task.kthDistinct(new String[]{"aaa", "aa", "a"}, 1)).isEqualTo("aaa");
    }

    @Test
    void kthDistinctExample3() {
        assertThat(task.kthDistinct(new String[]{"a", "b", "a"}, 3)).isEqualTo("");
    }
}