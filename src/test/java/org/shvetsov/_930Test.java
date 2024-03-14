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
    void numSubarraysWithSum() {
        assertThat(task.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2)).isEqualTo(4);
        assertThat(task.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0)).isEqualTo(15);
    }
}