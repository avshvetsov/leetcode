package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _300Test {

    private static _300 task;

    @BeforeEach
    public void setup() {
        task = new _300();
    }

    @Test
    void lengthOfLIS() {
        assertThat(task.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})).isEqualTo(4);
        assertThat(task.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3})).isEqualTo(4);
        assertThat(task.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7})).isEqualTo(1);
    }
}