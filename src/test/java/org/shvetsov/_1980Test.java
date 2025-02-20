package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1980Test {

    private static _1980 task;
    private static _1980.CantorsDiagonalArgument taskCantorsDiagonalArgument;

    @BeforeEach
    public void setup() {
        task = new _1980();
        taskCantorsDiagonalArgument = new _1980.CantorsDiagonalArgument();
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
    @Test
    void findDifferentBinaryStringTC88() {
        assertThat(task.findDifferentBinaryString(new String[]{"11010011101","10110010101","01011001111","01100011001","00110110110","10110011011","11110000010","01110000000","00110011100","11111011100","11111110110"})).isIn("00000000000");
    }

    @Test
    void findDifferentBinaryStringCantorsDiagonalArgumentExample1() {
        assertThat(taskCantorsDiagonalArgument.findDifferentBinaryString(new String[]{"01","10"})).isIn("11", "00");
    }
    @Test
    void findDifferentBinaryStringCantorsDiagonalArgumentExample2() {
        assertThat(taskCantorsDiagonalArgument.findDifferentBinaryString(new String[]{"00","01"})).isIn("11", "10");
    }
    @Test
    void findDifferentBinaryStringCantorsDiagonalArgumentExample3() {
        assertThat(taskCantorsDiagonalArgument.findDifferentBinaryString(new String[]{"111","011","001"})).isIn("101", "000", "010", "100", "110");
    }

}