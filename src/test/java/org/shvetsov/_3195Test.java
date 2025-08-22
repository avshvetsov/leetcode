package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3195Test {

    private static _3195 task;

    @BeforeEach
    public void setup() {
        task = new _3195();
    }

    @Test
    void minimumAreaExample1() {
        assertThat(task.minimumArea(new int[][]{{0,1,0},{1,0,1}})).isEqualTo(6);
    }

    @Test
    void minimumAreaExample2() {
        assertThat(task.minimumArea(new int[][]{{1,0},{0,0}})).isEqualTo(1);
    }
}