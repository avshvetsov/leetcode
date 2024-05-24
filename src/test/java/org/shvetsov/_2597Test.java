package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2597Test {

    private static _2597 task;
    private static _2597.Bruteforce taskBruteforce;
    private static _2597.EfficientNotFinishedSubsets taskEfficientNotFinishedSubsets;

    @BeforeEach
    public void setup() {
        task = new _2597();
        taskBruteforce = new _2597.Bruteforce();
        taskEfficientNotFinishedSubsets = new _2597.EfficientNotFinishedSubsets();
    }

    @Test
    void beautifulSubsetsExample1() {
        assertThat(task.beautifulSubsets(new int[]{2, 4, 6}, 2)).isEqualTo(4);
    }

    @Test
    void beautifulSubsetsExample2() {
        assertThat(task.beautifulSubsets(new int[]{1}, 1)).isEqualTo(1);
    }

    @Test
    void beautifulSubsetsExample3() {
        assertThat(task.beautifulSubsets(new int[]{4, 2, 5, 9, 10, 3}, 1)).isEqualTo(23);
    }

    @Test
    void beautifulSubsetsExample4() {
        assertThat(task.beautifulSubsets(new int[]{9, 5, 7, 10, 6, 2}, 9)).isEqualTo(63);
    }

    @Test
    void beautifulSubsetsExample5() {
        assertThat(task.beautifulSubsets(new int[]{1, 2, 3, 4}, 1)).isEqualTo(7);
    }

    @Test
    void beautifulSubsetsExample6() {
        assertThat(task.beautifulSubsets(new int[]{10, 4, 5, 7, 2, 1}, 3)).isEqualTo(23);
    }

    @Test
    void beautifulSubsetsExample7() {
        assertThat(task.beautifulSubsets(new int[]{10, 2, 6, 4, 5, 7, 3, 9, 1, 8}, 3)).isEqualTo(199);
    }

    @Test
    void taskNotEfficientSubsetsExample1() {
        assertThat(taskBruteforce.beautifulSubsets(new int[]{2, 4, 6}, 2)).isEqualTo(4);
    }

    @Test
    void taskNotEfficientSubsetsExample2() {
        assertThat(taskBruteforce.beautifulSubsets(new int[]{1}, 1)).isEqualTo(1);
    }

    @Test
    void taskNotEfficientSubsetsExample3() {
        assertThat(taskBruteforce.beautifulSubsets(new int[]{4, 2, 5, 9, 10, 3}, 1)).isEqualTo(23);
    }


    @Test
    void taskEfficientNotFinishedSubsetsExample1() {
        assertThat(taskEfficientNotFinishedSubsets.beautifulSubsets(new int[]{2, 4, 6}, 2)).isEqualTo(4);
    }

    @Test
    void taskEfficientNotFinishedSubsetsExample2() {
        assertThat(taskEfficientNotFinishedSubsets.beautifulSubsets(new int[]{1}, 1)).isEqualTo(1);
    }

    @Test
    void taskEfficientNotFinishedSubsetsExample3() {
        assertThat(taskEfficientNotFinishedSubsets.beautifulSubsets(new int[]{4, 2, 5, 9, 10, 3}, 1)).isEqualTo(23);
    }

    @Test
    void taskEfficientNotFinishedSubsetsExample4() {
        assertThat(taskEfficientNotFinishedSubsets.beautifulSubsets(new int[]{9, 5, 7, 10, 6, 2}, 9)).isEqualTo(63);
    }

    @Test
    void taskEfficientNotFinishedSubsetsExample5() {
        assertThat(taskEfficientNotFinishedSubsets.beautifulSubsets(new int[]{1, 2, 3, 4}, 1)).isEqualTo(7);
    }

    @Test
    void taskEfficientNotFinishedSubsetsExample6() {
        assertThat(taskEfficientNotFinishedSubsets.beautifulSubsets(new int[]{10, 4, 5, 7, 2, 1}, 3)).isEqualTo(23);
    }

    @Test
    void taskEfficientNotFinishedSubsetsExample7() {
        assertThat(taskEfficientNotFinishedSubsets.beautifulSubsets(new int[]{10, 2, 6, 4, 5, 7, 3, 9, 1, 8}, 3)).isEqualTo(199);
    }
}