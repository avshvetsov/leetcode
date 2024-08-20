package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1140Test {

    private static _1140 task;

    @BeforeEach
    public void setup() {
        task = new _1140();
    }

    @Test
    void stoneGameIIExample1() {
        assertThat(task.stoneGameII(new int[]{2, 7, 9, 4, 4})).isEqualTo(10);
    }

    @Test
    void stoneGameIIExample2() {
        assertThat(task.stoneGameII(new int[]{1,2,3,4,5,100})).isEqualTo(104);
    }
}