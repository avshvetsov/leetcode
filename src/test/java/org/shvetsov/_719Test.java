package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _719Test {

    private static _719 task;
    private static _719.BruteForce taskBruteForce;

    @BeforeEach
    public void setup() {
        task = new _719();
        taskBruteForce = new _719.BruteForce();
    }

    @Test
    void smallestDistancePairExample1() {
        assertThat(task.smallestDistancePair(new int[]{1, 3, 1}, 1)).isEqualTo(0);
    }

    @Test
    void smallestDistancePairExample2() {
        assertThat(task.smallestDistancePair(new int[]{1, 1, 1}, 2)).isEqualTo(0);
    }

    @Test
    void smallestDistancePairExample3() {
        assertThat(task.smallestDistancePair(new int[]{1, 6, 1}, 3)).isEqualTo(5);
    }

    @Test
    void smallestDistancePairBruteForceExample1() {
        assertThat(taskBruteForce.smallestDistancePair(new int[]{1, 3, 1}, 1)).isEqualTo(0);
    }

    @Test
    void smallestDistancePairBruteForceExample2() {
        assertThat(taskBruteForce.smallestDistancePair(new int[]{1, 1, 1}, 2)).isEqualTo(0);
    }

    @Test
    void smallestDistancePairBruteForceExample3() {
        assertThat(taskBruteForce.smallestDistancePair(new int[]{1, 6, 1}, 3)).isEqualTo(5);
    }
}