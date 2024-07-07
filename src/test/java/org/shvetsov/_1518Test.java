package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1518Test {

    private static _1518 task;

    @BeforeEach
    public void setup() {
        task = new _1518();
    }

    @Test
    void numWaterBottlesExample1() {
        assertThat(task.numWaterBottles(9, 3)).isEqualTo(13);
    }

    @Test
    void numWaterBottlesExample2() {
        assertThat(task.numWaterBottles(15, 4)).isEqualTo(19);
    }
}