package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1749Test {

    private _1749 task;

    @BeforeEach
    public void setup() {
        task = new _1749();
    }

    @Test
    void maxAbsoluteSumExample1() {
        assertThat(task.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4})).isEqualTo(5);
    }

    @Test
    void maxAbsoluteSumExample2() {
        assertThat(task.maxAbsoluteSum(new int[]{2, -5, 1, -4, 3, -2})).isEqualTo(8);
    }

}