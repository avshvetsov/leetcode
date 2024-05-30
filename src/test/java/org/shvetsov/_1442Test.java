package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1442Test {

    private static _1442 task;

    @BeforeEach
    public void setup() {
        task = new _1442();
    }

    @Test
    void countTripletsExample1() {
        assertThat(task.countTriplets(new int[]{2, 3, 1, 6, 7})).isEqualTo(4);
    }

    @Test
    void countTripletsExample2() {
        assertThat(task.countTriplets(new int[]{1, 1, 1, 1, 1})).isEqualTo(10);
    }
}