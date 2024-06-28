package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2285Test {

    private static _2285 task;

    @BeforeEach
    public void setup() {
        task = new _2285();
    }

    @Test
    void maximumImportanceExample1() {
        assertThat(task.maximumImportance(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}})).isEqualTo(43);
    }

    @Test
    void maximumImportanceExample2() {
        assertThat(task.maximumImportance(5, new int[][]{{0, 3}, {2, 4}, {1, 3}})).isEqualTo(20);
    }
}