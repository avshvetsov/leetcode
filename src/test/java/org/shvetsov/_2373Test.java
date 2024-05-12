package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2373Test {

    private static _2373 task;

    @BeforeEach
    public void setup() {
        task = new _2373();
    }

    @Test
    void largestLocal() {
        assertThat(task.largestLocal(new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}}))
                .isEqualTo(new int[][]{{9, 9}, {8, 6}});
        assertThat(task.largestLocal(new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}))
                .isEqualTo(new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}});
    }
}