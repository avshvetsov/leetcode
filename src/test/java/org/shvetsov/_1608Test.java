package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1608Test {

    private static _1608 task;

    @BeforeEach
    public void setup() {
        task = new _1608();
    }

    @Test
    void specialArrayExample1() {
        assertThat(task.specialArray(new int[]{3, 5})).isEqualTo(2);
    }

    @Test
    void specialArrayExample2() {
        assertThat(task.specialArray(new int[]{0, 0})).isEqualTo(-1);
    }

    @Test
    void specialArrayExample3() {
        assertThat(task.specialArray(new int[]{0, 4, 3, 0, 4})).isEqualTo(3);
    }
}