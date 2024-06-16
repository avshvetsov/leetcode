package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _502Test {

    private static _502 task;

    @BeforeEach
    public void setup() {
        task = new _502();
    }

    @Test
    void findMaximizedCapitalExample1() {
        assertThat(task.findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1})).isEqualTo(4);
    }

    @Test
    void findMaximizedCapitalExample2() {
        assertThat(task.findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2})).isEqualTo(6);
    }

}