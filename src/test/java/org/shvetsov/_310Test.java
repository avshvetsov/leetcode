package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _310Test {

    private static _310 task;
    private static _310.RemoveLeafApproach taskRemoveLeafApproach;

    @BeforeEach
    public void setup() {
        task = new _310();
        taskRemoveLeafApproach = new _310.RemoveLeafApproach();
    }

    @Test
    void findMinHeightTrees() {
        assertThat(task.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}})).isEqualTo(List.of(1));
        assertThat(task.findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}})).isEqualTo(List.of(3, 4));
    }
    @Test
    void findMinHeightTrees1() {
        assertThat(task.findMinHeightTrees(1, new int[][]{})).isEqualTo(List.of(0));
        assertThat(task.findMinHeightTrees(7, new int[][]{{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}})).isEqualTo(List.of(1, 2));
    }

    @Test
    void findMinHeightTreesRemoveLeafApproach() {
        assertThat(taskRemoveLeafApproach.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}})).isEqualTo(List.of(1));
        assertThat(taskRemoveLeafApproach.findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}})).isEqualTo(List.of(3, 4));
        assertThat(taskRemoveLeafApproach.findMinHeightTrees(1, new int[][]{})).isEqualTo(List.of(0));
        assertThat(taskRemoveLeafApproach.findMinHeightTrees(7, new int[][]{{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}})).isEqualTo(List.of(1, 2));
    }
}