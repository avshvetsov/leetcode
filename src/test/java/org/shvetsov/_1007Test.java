package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1007Test {

    private static _1007 task;

    @BeforeEach
    public void setup() {
        task = new _1007();
    }

    @Test
    void minDominoRotationsExample1() {
        assertThat(task.minDominoRotations(new int[]{2, 1, 2, 4, 2, 2}, new int[]{5, 2, 6, 2, 3, 2})).isEqualTo(2);
    }

    @Test
    void minDominoRotationsExample2() {
        assertThat(task.minDominoRotations(new int[]{3, 5, 1, 2, 3}, new int[]{3, 6, 3, 3, 4})).isEqualTo(-1);
    }
}