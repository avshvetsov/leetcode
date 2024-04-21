package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1971Test {

    private static _1971 task;

    @BeforeEach
    public void setup() {
        task = new _1971();
    }

    @Test
    void validPath() {
        assertThat(task.validPath(3, new int[][]{{0,1},{1,2},{2,0}}, 0, 2)).isTrue();
        assertThat(task.validPath(6, new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5)).isFalse();
    }
}