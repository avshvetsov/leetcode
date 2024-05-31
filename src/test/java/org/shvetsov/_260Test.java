package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _260Test {

    private static _260 task;

    @BeforeEach
    public void setup() {
        task = new _260();
    }

    @Test
    void singleNumberExample1() {
        assertThat(task.singleNumber(new int[]{1, 2, 1, 3, 2, 5})).containsExactlyInAnyOrder(3, 5);
    }

    @Test
    void singleNumberExample2() {
        assertThat(task.singleNumber(new int[]{-1, 0})).containsExactlyInAnyOrder(-1, 0);
    }

    @Test
    void singleNumberExample3() {
        assertThat(task.singleNumber(new int[]{0, 1})).containsExactlyInAnyOrder(0, 1);
    }

}