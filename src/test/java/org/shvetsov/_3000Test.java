package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3000Test {

    private static _3000 task;

    @BeforeEach
    public void setup() {
        task = new _3000();
    }

    @Test
    void areaOfMaxDiagonalExample1() {
        assertThat(task.areaOfMaxDiagonal(new int[][]{{9,3},{8,6}})).isEqualTo(48);
    }

    @Test
    void areaOfMaxDiagonalExample2() {
        assertThat(task.areaOfMaxDiagonal(new int[][]{{3,4},{4,3}})).isEqualTo(12);
    }
}