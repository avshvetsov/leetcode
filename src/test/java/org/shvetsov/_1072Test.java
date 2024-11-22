package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1072Test {

    private static _1072 task;

    @BeforeEach
    public void setup() {
        task = new _1072();
    }

    @Test
    void maxEqualRowsAfterFlipsExample1() {
        assertThat(task.maxEqualRowsAfterFlips(new int[][]{{0,1},{1,1}})).isEqualTo(1);
    }
    @Test
    void maxEqualRowsAfterFlipsExample2() {
        assertThat(task.maxEqualRowsAfterFlips(new int[][]{{0,1},{1,0}})).isEqualTo(2);
    }
    @Test
    void maxEqualRowsAfterFlipsExample3() {
        assertThat(task.maxEqualRowsAfterFlips(new int[][]{{0,0,0},{0,0,1},{1,1,0}})).isEqualTo(2);
    }
}