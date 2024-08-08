package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _885Test {

    private static _885 task;

    @BeforeEach
    public void setup() {
        task = new _885();
    }

    @Test
    void spiralMatrixIIIExample1() {
        assertThat(task.spiralMatrixIII(1, 4, 0, 0))
                .isEqualTo(new int[][]{{0, 0}, {0, 1}, {0, 2}, {0, 3}});
    }

    @Test
    void spiralMatrixIIIExample2() {
        assertThat(task.spiralMatrixIII(5, 6, 1, 4))
                .isEqualTo(new int[][]{{1, 4}, {1, 5}, {2, 5}, {2, 4}, {2, 3}, {1, 3}, {0, 3}, {0, 4}, {0, 5}, {3, 5}, {3, 4}, {3, 3}, {3, 2}, {2, 2}, {1, 2}, {0, 2}, {4, 5}, {4, 4}, {4, 3}, {4, 2}, {4, 1}, {3, 1}, {2, 1}, {1, 1}, {0, 1}, {4, 0}, {3, 0}, {2, 0}, {1, 0}, {0, 0}});
    }
}