package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _873Test {

    private _873 task;

    @BeforeEach
    public void setup() {
        task = new _873();
    }

    @Test
    void lenLongestFibSubseqExample1() {
        assertThat(task.lenLongestFibSubseq(new int[]{1, 2, 3, 4, 5, 6, 7, 8})).isEqualTo(5);
    }

    @Test
    void lenLongestFibSubseqExample2() {
        assertThat(task.lenLongestFibSubseq(new int[]{1, 3, 7, 11, 12, 14, 18})).isEqualTo(3);
    }

}