package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1971Test {

    private static _1971 task;
    private static _1971.BFS taskBFS;
    private static _1971.DFS taskDFS;
    private static _1971.UnionFind taskUnionFind;

    @BeforeEach
    public void setup() {
        task = new _1971();
        taskBFS = new _1971.BFS();
        taskDFS = new _1971.DFS();
        taskUnionFind = new _1971.UnionFind();
    }

    @Test
    void validPath() {
        assertThat(task.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2)).isTrue();
        assertThat(task.validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5)).isFalse();
    }


    @Test
    void validPathBFS() {
        assertThat(taskBFS.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2)).isTrue();
        assertThat(taskBFS.validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5)).isFalse();
    }

    @Test
    void validPathDFS() {
        assertThat(taskDFS.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2)).isTrue();
        assertThat(taskDFS.validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5)).isFalse();
    }

    @Test
    void validPathUnionFind() {
        assertThat(taskUnionFind.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2)).isTrue();
        assertThat(taskUnionFind.validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5)).isFalse();
        assertThat(taskUnionFind.validPath(10, new int[][]{{2, 6}, {4, 7}, {1, 2}, {3, 5}, {7, 9}, {6, 4}, {9, 8}, {0, 1}, {3, 0}}, 3, 5)).isTrue();
    }
}