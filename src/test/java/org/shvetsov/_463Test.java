package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _463Test {

    private static _463 task;

    @BeforeEach
    public void setup() {
        task = new _463();
    }

    @Test
    void islandPerimeter() {
        assertThat(task.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}})).isEqualTo(16);
        assertThat(task.islandPerimeter(new int[][]{{1}})).isEqualTo(4);
        assertThat(task.islandPerimeter(new int[][]{{1, 0}})).isEqualTo(4);
    }
}