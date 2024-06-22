package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1248Test {

    private static _1248 task;

    @BeforeEach
    public void setup() {
        task = new _1248();
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
}