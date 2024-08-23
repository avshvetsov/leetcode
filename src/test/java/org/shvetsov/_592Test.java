package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _592Test {

    private static _592 task;

    @BeforeEach
    public void setup() {
        task = new _592();
    }

    @Test
    void fractionAdditionExample1() {
        assertThat(task.fractionAddition("-1/2+1/2")).isEqualTo("0/1");
    }
    @Test
    void fractionAdditionExample2() {
        assertThat(task.fractionAddition("-1/2+1/2+1/3")).isEqualTo("1/3");
    }
    @Test
    void fractionAdditionExample3() {
        assertThat(task.fractionAddition("1/3-1/2")).isEqualTo("-1/6");
    }
}