package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2597Test {

    private static _2597 task;

    @BeforeEach
    public void setup() {
        task = new _2597();
    }

    @Test
    void beautifulSubsetsExample1() {
        assertThat(task.beautifulSubsets(new int[]{2, 4, 6}, 2)).isEqualTo(4);
    }
    @Test
    void beautifulSubsetsExample2() {
        assertThat(task.beautifulSubsets(new int[]{1}, 1)).isEqualTo(1);
    }
}