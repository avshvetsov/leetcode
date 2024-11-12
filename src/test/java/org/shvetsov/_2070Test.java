package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2070Test {

    private static _2070 task;

    @BeforeEach
    public void setup() {
        task = new _2070();
    }

    @Test
    void maximumBeautyExample1() {
        assertThat(task.maximumBeauty(new int[][]{{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}}, new int[]{1, 2, 3, 4, 5, 6})).containsExactly(2, 4, 5, 5, 6, 6);
    }

    @Test
    void maximumBeautyExample2() {
        assertThat(task.maximumBeauty(new int[][]{{1, 2}, {1, 2}, {1, 3}, {1, 4}}, new int[]{1})).containsExactly(4);
    }

    @Test
    void maximumBeautyExample3() {
        assertThat(task.maximumBeauty(new int[][]{{10, 1000}}, new int[]{5})).containsExactly(0);
    }
}