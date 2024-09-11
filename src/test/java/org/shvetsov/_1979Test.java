package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1979Test {

    private static _1979 task;

    @BeforeEach
    public void setup() {
        task = new _1979();
    }

    @Test
    void findGCDExample1() {
        assertThat(task.findGCD(new int[]{2, 5, 6, 9, 10})).isEqualTo(2);
    }
    @Test
    void findGCDExample2() {
        assertThat(task.findGCD(new int[]{7,5,6,8,3})).isEqualTo(1);
    }
    @Test
    void findGCDExample3() {
        assertThat(task.findGCD(new int[]{3, 3})).isEqualTo(3);
    }
}