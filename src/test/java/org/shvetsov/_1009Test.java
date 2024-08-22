package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1009Test {

    private static _1009 task;

    @BeforeEach
    public void setup() {
        task = new _1009();
    }

    @Test
    void bitwiseComplementExample1() {
        assertThat(task.bitwiseComplement(5)).isEqualTo(2);
    }
    @Test
    void bitwiseComplementExample2() {
        assertThat(task.bitwiseComplement(7)).isEqualTo(0);
    }
    @Test
    void bitwiseComplementExample3() {
        assertThat(task.bitwiseComplement(10)).isEqualTo(5);
    }
}