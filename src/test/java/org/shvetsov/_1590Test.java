package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1590Test {

    private static _1590 task;
    private static _1590.BruteForce taskBruteForce;

    @BeforeEach
    public void setup() {
        task = new _1590();
        taskBruteForce = new _1590.BruteForce();
    }

    @Test
    void minSubarrayExample1() {
        assertThat(task.minSubarray(new int[]{3, 1, 4, 2}, 6)).isEqualTo(1);
    }

    @Test
    void minSubarrayExample2() {
        assertThat(task.minSubarray(new int[]{6, 3, 5, 2}, 9)).isEqualTo(2);
    }

    @Test
    void minSubarrayExample3() {
        assertThat(task.minSubarray(new int[]{1, 2, 3}, 3)).isEqualTo(0);
    }

    @Test
    void minSubarrayTC92() {
        assertThat(task.minSubarray(new int[]{1000000000, 1000000000, 1000000000}, 3)).isEqualTo(0);
    }

    @Test
    void minSubarrayTC95() {
        assertThat(task.minSubarray(new int[]{3, 6, 8, 1}, 8)).isEqualTo(-1);
    }

    @Test
    void minSubarrayTC141() {
        assertThat(task.minSubarray(new int[]{1000000000, 1, 1, 1, 1, 1}, 1000000000)).isEqualTo(5);
    }
    @Test
    void minSubarrayBruteForceExample1() {
        assertThat(taskBruteForce.minSubarray(new int[]{3, 1, 4, 2}, 6)).isEqualTo(1);
    }

    @Test
    void minSubarrayBruteForceExample2() {
        assertThat(taskBruteForce.minSubarray(new int[]{6, 3, 5, 2}, 9)).isEqualTo(2);
    }

    @Test
    void minSubarrayBruteForceExample3() {
        assertThat(taskBruteForce.minSubarray(new int[]{1, 2, 3}, 3)).isEqualTo(0);
    }

    @Test
    void minSubarrayBruteForceTC92() {
        assertThat(taskBruteForce.minSubarray(new int[]{1000000000, 1000000000, 1000000000}, 3)).isEqualTo(0);
    }

    @Test
    void minSubarrayBruteForceTC95() {
        assertThat(taskBruteForce.minSubarray(new int[]{3, 6, 8, 1}, 8)).isEqualTo(-1);
    }

    @Test
    void minSubarrayBruteForceTC141() {
        assertThat(taskBruteForce.minSubarray(new int[]{1000000000, 1, 1, 1, 1, 1}, 1000000000)).isEqualTo(5);
    }
}