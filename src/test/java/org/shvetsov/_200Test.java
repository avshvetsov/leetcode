package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _200Test {

    private static _200 task;

    @BeforeEach
    public void setup() {
        task = new _200();
    }

    @Test
    void numIslands() {
//        @formatter:off
        assertThat(task.numIslands(new char[][]{{'1', '1', '1', '1', '0'},
                                                {'1', '1', '0', '1', '0'},
                                                {'1', '1', '0', '0', '0'},
                                                {'0', '0', '0', '0', '0'}}))
                .isEqualTo(1);
        assertThat(task.numIslands(new char[][]{{'1','1','0','0','0'},
                                                {'1','1','0','0','0'},
                                                {'0','0','1','0','0'},
                                                {'0','0','0','1','1'}}))
                .isEqualTo(3);
//        @formatter:on
    }
}