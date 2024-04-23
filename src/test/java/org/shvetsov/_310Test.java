package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _310Test {

    private static _310 task;

    @BeforeEach
    public void setup() {
        task = new _310();
    }

    @Test
    void findMinHeightTrees() {
        assertThat(task.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}})).isEqualTo(List.of(1));
        assertThat(task.findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}})).isEqualTo(List.of(3, 4));
    }
}