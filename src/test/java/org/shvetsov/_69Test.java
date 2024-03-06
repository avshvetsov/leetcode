package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _69Test {

    private static _69 task;

    @BeforeEach
    public void setup() {
        task = new _69();
    }

    @Test
    void plusOne() {
        assertThat(task.mySqrt(4)).isEqualTo(2);
        assertThat(task.mySqrt(8)).isEqualTo(2);
        assertThat(task.mySqrt(100)).isEqualTo(10);
    }

}