package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _564Test {

    private static _564 task;

    @BeforeEach
    public void setup() {
        task = new _564();
    }

    @Test
    void nearestPalindromicExample1() {
        assertThat(task.nearestPalindromic("123")).isEqualTo("121");
    }

    @Test
    void nearestPalindromicExample2() {
        assertThat(task.nearestPalindromic("1")).isEqualTo("0");
    }
}