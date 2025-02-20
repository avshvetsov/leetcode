package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1980Test {

    private static _1980 task;

    @BeforeEach
    public void setup() {
        task = new _1980();
    }

    @Test
    void findDifferentBinaryStringExample1() {
        assertThat(task.findDifferentBinaryString(new String[]{"01","10"})).isEqualTo("11");
    }
    @Test
    void findDifferentBinaryStringExample2() {
        assertThat(task.findDifferentBinaryString(new String[]{"00","01"})).isEqualTo("11");
    }
    @Test
    void findDifferentBinaryStringExample3() {
        assertThat(task.findDifferentBinaryString(new String[]{"111","011","001"})).isEqualTo("101");
    }

}