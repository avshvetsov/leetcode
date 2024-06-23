package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1248Test {

    private static _1248 task;
    private static _1248.PrefixSum taskPrefixSum;

    @BeforeEach
    public void setup() {
        task = new _1248();
        taskPrefixSum = new _1248.PrefixSum();
    }

    @Test
    void numberOfSubarraysExample1() {
        assertThat(task.numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3)).isEqualTo(2);
    }

    @Test
    void numberOfSubarraysExample2() {
        assertThat(task.numberOfSubarrays(new int[]{2, 4, 6}, 1)).isEqualTo(0);
    }

    @Test
    void numberOfSubarraysExample3() {
        assertThat(task.numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2)).isEqualTo(16);
    }
    @Test
    void numberOfSubarraysTC4() {
        assertThat(task.numberOfSubarrays(new int[]{1,1,1,1,1}, 1)).isEqualTo(5);
    }
    @Test
    void numberOfSubarraysTC6() {
        assertThat(task.numberOfSubarrays(new int[]{45627,50891,94884,11286,35337,46414,62029,20247,72789,89158,54203,79628,25920,16832,47469,80909}, 1)).isEqualTo(28);
    }

    @Test
    void numberOfSubarraysPrefixSumExample1() {
        assertThat(taskPrefixSum.numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3)).isEqualTo(2);
    }

    @Test
    void numberOfSubarraysPrefixSumExample2() {
        assertThat(taskPrefixSum.numberOfSubarrays(new int[]{2, 4, 6}, 1)).isEqualTo(0);
    }

    @Test
    void numberOfSubarraysPrefixSumExample3() {
        assertThat(taskPrefixSum.numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2)).isEqualTo(16);
    }
}