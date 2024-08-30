package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov._2699.MAX_DISTANCE;

class _2699Test {

    private static _2699 task;

    @BeforeEach
    public void setup() {
        task = new _2699();
    }

    @Test
    void modifiedGraphEdgesExample1() {
        assertThat(task.modifiedGraphEdges(5, new int[][]{{4, 1, -1}, {2, 0, -1}, {0, 3, -1}, {4, 3, -1}}, 0, 1, 5))
                .isDeepEqualTo(new int[][]{{4, 1, 3}, {2, 0, MAX_DISTANCE}, {0, 3, 1}, {4, 3, 1}});
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
    
    @Test
    void modifiedGraphEdgesTC604() {
        assertThat(task.modifiedGraphEdges(4, new int[][]{{0, 1, -1}, {1, 2, -1}, {3, 1, -1}, {3, 0, 2}, {0, 2, 5}}, 2, 3, 8))
                .isEmpty();
    }

    @Test
    void modifiedGraphEdgesTC726() {
        assertThat(task.modifiedGraphEdges(4, new int[][]{{3, 0, -1}, {1, 2, -1}, {2, 3, -1}, {1, 3, 9}, {2, 0, 5}}, 0, 1, 7))
                .isDeepEqualTo(new int[][]{{3, 0, MAX_DISTANCE}, {1, 2, 2}, {2, 3, MAX_DISTANCE}, {1, 3, 9}, {2, 0, 5}});
    }
}