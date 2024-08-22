package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _476Test {

    private static _476 task;

    @BeforeEach
    public void setup() {
        task = new _476();
    }

    @Test
    void findComplementExample1() {
        assertThat(task.findComplement(5)).isEqualTo(2);
    }

    @Test
    void findComplementExample2() {
        assertThat(task.findComplement(1)).isEqualTo(0);
    }
}