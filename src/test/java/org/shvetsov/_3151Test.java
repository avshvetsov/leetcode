package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3151Test {

    private static _3151 task;

    @BeforeEach
    public void setup() {
        task = new _3151();
    }

    @Test
    void isArraySpecialExample1() {
        assertThat(task.isArraySpecial(new int[]{1})).isTrue();
    }

    @Test
    void isArraySpecialExample2() {
        assertThat(task.isArraySpecial(new int[]{2, 1, 4})).isTrue();
    }

    @Test
    void isArraySpecialExample3() {
        assertThat(task.isArraySpecial(new int[]{4, 3, 1, 6})).isFalse();
    }
}