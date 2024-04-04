package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1614Test {

    private static _1614 task;

    @BeforeEach
    public void setup() {
        task = new _1614();
    }
    @Test
    void maxDepth() {
        assertThat(task.maxDepth("(1+(2*3)+((8)/4))+1")).isEqualTo(3);
        assertThat(task.maxDepth("(1)+((2))+(((3)))")).isEqualTo(3);
    }
}