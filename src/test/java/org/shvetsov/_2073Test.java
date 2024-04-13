package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2073Test {

    private static _2073 task;

    @BeforeEach
    public void setup() {
        task = new _2073();
    }

    @Test
    void timeRequiredToBuy() {
        assertThat(task.timeRequiredToBuy(new int[]{2, 3, 2}, 2)).isEqualTo(6);
        assertThat(task.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0)).isEqualTo(8);
    }
}