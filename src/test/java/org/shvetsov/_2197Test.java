package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2197Test {

    private _2197 task;

    @BeforeEach
    public void setup() {
        this.task = new _2197();
    }

    @Test
    void replaceNonCoprimesExample1() {
        assertThat(task.replaceNonCoprimes(new int[]{6, 4, 3, 2, 7, 6, 2})).containsExactly(12, 7, 6);
    }

    @Test
    void replaceNonCoprimesExample2() {
        assertThat(task.replaceNonCoprimes(new int[]{2, 2, 1, 1, 3, 3, 3})).containsExactly(2, 1, 1, 3);
    }
}