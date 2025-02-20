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
        assertThat(task.findDifferentBinaryString(new String[]{"01","10"})).isIn("11", "00");
    }
    @Test
    void findDifferentBinaryStringExample2() {
        assertThat(task.findDifferentBinaryString(new String[]{"00","01"})).isIn("11", "10");
    }
    @Test
    void findDifferentBinaryStringExample3() {
        assertThat(task.findDifferentBinaryString(new String[]{"111","011","001"})).isIn("101", "000", "010", "100", "110");
    }

}