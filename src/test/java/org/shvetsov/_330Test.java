package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _330Test {

    private static _330 task;

    @BeforeEach
    public void setup() {
        task = new _330();
    }

    @Test
    void minPatchesExample1() {
        assertThat(task.minPatches(new int[]{1, 3}, 6)).isEqualTo(1);
    }

    @Test
    void minPatchesExample2() {
        assertThat(task.minPatches(new int[]{1, 5, 10}, 20)).isEqualTo(2);
    }

    @Test
    void minPatchesExample3() {
        assertThat(task.minPatches(new int[]{1, 2, 2}, 5)).isEqualTo(0);
    }

    @Test
    void minPatchesTC3() {
        assertThat(task.minPatches(new int[]{1, 2, 31, 33}, 2147483647)).isEqualTo(28);
    }

    @Test
    void minPatchesTC4() {
        assertThat(task.minPatches(new int[]{2, 4}, 7)).isEqualTo(1);
    }
}