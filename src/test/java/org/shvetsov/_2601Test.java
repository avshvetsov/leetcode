package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2601Test {

    private static _2601 task;

    @BeforeEach
    public void setup() {
        task = new _2601();
    }

    @Test
    void primeSubOperationExample1() {
        assertThat(task.primeSubOperation(new int[]{4, 9, 6, 10})).isTrue();
    }

    @Test
    void primeSubOperationExample2() {
        assertThat(task.primeSubOperation(new int[]{6, 8, 11, 12})).isTrue();
    }

    @Test
    void primeSubOperationExample3() {
        assertThat(task.primeSubOperation(new int[]{5, 8, 3})).isFalse();
    }
}