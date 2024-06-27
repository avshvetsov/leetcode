package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1791Test {

    private static _1791 task;

    @BeforeEach
    public void setup() {
        task = new _1791();
    }

    @Test
    void findCenterExample1() {
        assertThat(task.findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}})).isEqualTo(2);
    }

    @Test
    void findCenterExample2() {
        assertThat(task.findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}})).isEqualTo(1);
    }
}