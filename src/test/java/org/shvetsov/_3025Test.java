package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3025Test {

    private _3025 task;

    @BeforeEach
    public void setup() {
        this.task = new _3025();
    }

    @Test
    void numberOfPairsExample1() {
        assertThat(task.numberOfPairs(new int[][]{{1, 1}, {2, 2}, {3, 3}})).isEqualTo(0);
    }

    @Test
    void numberOfPairsExample2() {
        assertThat(task.numberOfPairs(new int[][]{{6, 2}, {4, 4}, {2, 6}})).isEqualTo(2);
    }

    @Test
    void numberOfPairsExample3() {
        assertThat(task.numberOfPairs(new int[][]{{3, 1}, {1, 3}, {1, 1}})).isEqualTo(2);
    }
}