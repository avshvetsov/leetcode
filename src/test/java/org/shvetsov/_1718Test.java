package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1718Test {

    private static _1718 task;

    @BeforeEach
    public void setup() {
        task = new _1718();
    }

    @Test
    void constructDistancedSequenceExample1() {
        assertThat(task.constructDistancedSequence(3)).isEqualTo(new int[]{3, 1, 2, 3, 2});
    }

    @Test
    void constructDistancedSequenceExample2() {
        assertThat(task.constructDistancedSequence(5)).isEqualTo(new int[]{5, 3, 1, 4, 3, 5, 2, 4, 2});
    }

}