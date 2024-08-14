package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _719Test {

    private static _719 task;

    @BeforeEach
    public void setup() {
        task = new _719();
    }

    @Test
    void smallestDistancePairExample1() {
        assertThat(task.smallestDistancePair(new int[]{1, 3, 1}, 1)).isEqualTo(0);
    }

    @Test
    void smallestDistancePairExample2() {
        assertThat(task.smallestDistancePair(new int[]{1, 1, 1}, 2)).isEqualTo(0);
    }

    @Test
    void smallestDistancePairExample3() {
        assertThat(task.smallestDistancePair(new int[]{1, 6, 1}, 3)).isEqualTo(5);
    }
}