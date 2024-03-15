package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _930Test {

    private _930 task;

    @BeforeEach
    public void setup() {
        task = new _930();
    }

    @Test
    void numSubarraysWithSum1() {
        assertThat(task.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2)).isEqualTo(4);
    }

    @Test
    void numSubarraysWithSum2() {
        assertThat(task.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0)).isEqualTo(15);
    }

    @Test
    void numSubarraysWithSum3() {
        assertThat(task.numSubarraysWithSum(new int[]{0, 1, 1, 1, 1}, 3)).isEqualTo(3);
    }

    @Test
    void numSubarraysWithSum4() {
        assertThat(task.numSubarraysWithSum(new int[]{0, 0, 0, 0, 1}, 2)).isEqualTo(0);
    }

    @Test
    void numSubarraysWithSum5() {
        assertThat(task.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 1)).isEqualTo(0);
    }

    @Test
    void numSubarraysWithSum6() {
        assertThat(task.numSubarraysWithSum(new int[]{0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0}, 5)).isEqualTo(10);
    }
}