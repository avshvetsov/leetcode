package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3066Test {

    private static _3066 task;

    @BeforeEach
    public void setup() {
        task = new _3066();
    }

    @Test
    void minOperationsExample1() {
        assertThat(task.minOperations(new int[]{2, 11, 10, 1, 3}, 10)).isEqualTo(2);
    }

    @Test
    void minOperationsExample2() {
        assertThat(task.minOperations(new int[]{1, 1, 2, 4, 9}, 20)).isEqualTo(4);
    }

}