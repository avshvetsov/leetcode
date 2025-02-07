package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3160Test {

    private static _3160 task;

    @BeforeEach
    public void setup() {
        task = new _3160();
    }

    @Test
    void queryResultsExample1() {
        assertThat(task.queryResults(4, new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}})).isEqualTo(new int[]{1, 2, 2, 3});
    }

    @Test
    void queryResultsExample2() {
        assertThat(task.queryResults(4, new int[][]{{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}})).isEqualTo(new int[]{1, 2, 2, 3, 4});
    }

    @Test
    void queryResultsOptimizedExample1() {
        assertThat(task.queryResults(4, new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}})).isEqualTo(new int[]{1, 2, 2, 3});
    }

    @Test
    void queryResultsOptimizedExample2() {
        assertThat(task.queryResults(4, new int[][]{{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}})).isEqualTo(new int[]{1, 2, 2, 3, 4});
    }

}