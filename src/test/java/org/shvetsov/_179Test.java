package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _179Test {

    private static _179 task;

    @BeforeEach
    public void setup() {
        task = new _179();
    }

    @Test
    void largestNumberExample1() {
        assertThat(task.largestNumber(new int[]{10, 2})).isEqualTo("210");
    }

    @Test
    void largestNumberExample2() {
        assertThat(task.largestNumber(new int[]{3, 30, 34, 5, 9})).isEqualTo("9534330");
    }
}