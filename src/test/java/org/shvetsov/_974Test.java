package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _974Test {

    private static _974 task;

    @BeforeEach
    public void setup() {
        task = new _974();
    }

    @Test
    void subarraysDivByKExample1() {
        assertThat(task.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5)).isEqualTo(7);
    }

    @Test
    void subarraysDivByKExample2() {
        assertThat(task.subarraysDivByK(new int[]{5}, 9)).isEqualTo(0);
    }
}