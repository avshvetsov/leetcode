package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1726Test {

    private static _1726 task;

    @BeforeEach
    public void setup() {
        task = new _1726();
    }

    @Test
    void tupleSameProductExample1() {
        assertThat(task.tupleSameProduct(new int[]{2, 3, 4, 6})).isEqualTo(8);
    }

    @Test
    void tupleSameProductExample2() {
        assertThat(task.tupleSameProduct(new int[]{1, 2, 4, 5, 10})).isEqualTo(16);
    }

}