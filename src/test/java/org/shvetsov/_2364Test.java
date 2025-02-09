package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2364Test {

    private static _2364 task;

    @BeforeEach
    public void setup() {
        task = new _2364();
    }

    @Test
    void countBadPairsExample1() {
        assertThat(task.countBadPairs(new int[]{4, 1, 3, 3})).isEqualTo(5);
    }

    @Test
    void countBadPairsExample2() {
        assertThat(task.countBadPairs(new int[]{1,2,3,4,5})).isEqualTo(0);
    }

}