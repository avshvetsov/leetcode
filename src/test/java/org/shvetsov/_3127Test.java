package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3127Test {

    private static _3127 task;

    @BeforeEach
    public void setup() {
        task = new _3127();
    }

    @Test
    void canMakeSquare() {
        assertThat(task.canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'B'}})).isTrue();
        assertThat(task.canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'W', 'B', 'W'}, {'B', 'W', 'B'}})).isFalse();
        assertThat(task.canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'W'}})).isTrue();
    }
}