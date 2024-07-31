package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1105Test {

    private static _1105 task;

    @BeforeEach
    public void setup() {
        task = new _1105();
    }

    @Test
    void minHeightShelvesExample1() {
        assertThat(task.minHeightShelves(new int[][]{{1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}}, 4)).isEqualTo(6);
    }

    @Test
    void minHeightShelvesExample2() {
        assertThat(task.minHeightShelves(new int[][]{{1, 3}, {2, 4}, {3, 2}}, 6)).isEqualTo(4);
    }
}