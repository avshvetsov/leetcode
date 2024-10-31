package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2684Test {

    private static _2684 task;

    @BeforeEach
    public void setup() {
        task = new _2684();
    }

    @Test
    void maxMovesExample1() {
        assertThat(task.maxMoves(new int[][]{{2, 4, 3, 5}, {5, 4, 9, 3}, {3, 4, 2, 11}, {10, 9, 13, 15}})).isEqualTo(3);
    }

    @Test
    void maxMovesExample2() {
        assertThat(task.maxMoves(new int[][]{{3, 2, 4}, {2, 1, 9}, {1, 1, 7}})).isEqualTo(0);
    }
}