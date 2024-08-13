package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _40Test {

    private static _40 task;
    private static _40.NoFreq taskNoFreq;

    @BeforeEach
    public void setup() {
        task = new _40();
        taskNoFreq = new _40.NoFreq();
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

    @Test
    void combinationSum2TC2() {
        assertThat(task.combinationSum2(new int[]{2}, 1))
                .containsExactlyInAnyOrder();
    }

    @Test
    void combinationSum2TC172() {
        assertThat(task.combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 30))
                .containsExactlyInAnyOrder(List.of(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
    }

    @Test
    void combinationSum2NoFreqExample1() {
        assertThat(taskNoFreq.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8))
                .containsExactlyInAnyOrder(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6));
    }

    @Test
    void combinationSum2NoFreqExample2() {
        assertThat(taskNoFreq.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5))
                .containsExactlyInAnyOrder(List.of(1, 2, 2), List.of(5));
    }

    @Test
    void combinationSum2NoFreqTC2() {
        assertThat(taskNoFreq.combinationSum2(new int[]{2}, 1))
                .containsExactlyInAnyOrder();
    }

    @Test
    void combinationSum2NoFreqTC172() {
        assertThat(taskNoFreq.combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 30))
                .containsExactlyInAnyOrder(List.of(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
    }

}