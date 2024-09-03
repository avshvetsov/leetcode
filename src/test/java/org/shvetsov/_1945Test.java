package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1945Test {

    private static _1945 task;

    @BeforeEach
    public void setup() {
        task = new _1945();
    }

    @Test
    void getLuckyExample1() {
        assertThat(task.getLucky("iiii", 1)).isEqualTo(36);
    }

    @Test
    void getLuckyExample2() {
        assertThat(task.getLucky("leetcode", 2)).isEqualTo(6);
    }

    @Test
    void getLuckyExample3() {
        assertThat(task.getLucky("zbax", 2)).isEqualTo(8);
    }
}