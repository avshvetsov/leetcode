package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2699Test {

    private static _2699 task;

    @BeforeEach
    public void setup() {
        task = new _2699();
    }

    @Test
    void modifiedGraphEdgesExample1() {
        assertThat(task.modifiedGraphEdges(5, new int[][]{{4, 1, -1}, {2, 0, -1}, {0, 3, -1}, {4, 3, -1}}, 0, 1, 5))
                .isDeepEqualTo(new int[][]{{4, 1, 1}, {2, 0, 1}, {0, 3, 3}, {4, 3, 1}});
    }

    @Test
    void modifiedGraphEdgesExample2() {
        assertThat(task.modifiedGraphEdges(3, new int[][]{{0, 1, -1}, {0, 2, 5}}, 0, 2, 6))
                .isEmpty();
    }

    @Test
    void modifiedGraphEdgesExample3() {
        assertThat(task.modifiedGraphEdges(4, new int[][]{{1, 0, 4}, {1, 2, 3}, {2, 3, 5}, {0, 3, -1}}, 0, 2, 6))
                .isDeepEqualTo(new int[][]{{1, 0, 4}, {1, 2, 3}, {2, 3, 5}, {0, 3, 1}});
    }
}