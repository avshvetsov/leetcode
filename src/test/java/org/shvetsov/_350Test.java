package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _350Test {

    private static _350 task;

    @BeforeEach
    public void setup() {
        task = new _350();
    }

    @Test
    void intersectExample1() {
        assertThat(task.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})).isEqualTo(new int[]{2, 2});
    }

    @Test
    void intersectExample2() {
        assertThat(task.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})).isEqualTo(new int[]{4, 9});
    }
}