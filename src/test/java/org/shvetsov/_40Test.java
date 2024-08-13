package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _40Test {

    private static _40 task;

    @BeforeEach
    public void setup() {
        task = new _40();
    }

    @Test
    void combinationSum2Example1() {
        assertThat(task.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8))
                .containsExactlyInAnyOrder(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
    }

    @Test
    void combinationSum2Example2() {
        assertThat(task.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5))
                .containsExactlyInAnyOrder(List.of(1, 2, 2), List.of(5));
    }
}