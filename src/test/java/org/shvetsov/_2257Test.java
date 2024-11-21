package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2257Test {

    private static _2257 task;

    @BeforeEach
    public void setup() {
        task = new _2257();
    }

    @Test
    void countUnguardedExample1() {
        assertThat(task.countUnguarded(4, 6, new int[][]{{0, 0}, {1, 1}, {2, 3}}, new int[][]{{0, 1}, {2, 2}, {1, 4}})).isEqualTo(7);
    }

    @Test
    void countUnguardedExample2() {
        assertThat(task.countUnguarded(3, 3, new int[][]{{1, 1}}, new int[][]{{0, 1}, {1, 0}, {2, 1}, {1, 2}})).isEqualTo(4);
    }
}