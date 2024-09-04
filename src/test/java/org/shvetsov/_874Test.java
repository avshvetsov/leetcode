package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _874Test {

    private static _874 task;

    @BeforeEach
    public void setup() {
        task = new _874();
    }


    @Test
    void robotSimExample1() {
        assertThat(task.robotSim(new int[]{4, -1, 3}, new int[0][])).isEqualTo(25);
    }

    @Test
    void robotSimExample2() {
        assertThat(task.robotSim(new int[]{4, -1, 4, -2, 4}, new int[][]{{2, 4}})).isEqualTo(65);
    }

    @Test
    void robotSimExample3() {
        assertThat(task.robotSim(new int[]{6, -1, -1, 6}, new int[0][])).isEqualTo(36);
    }
}