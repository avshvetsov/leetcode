package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.GeneralUtils.twoDimArrayToListOfLists;

class _2812Test {

    private static _2812 task;

    @BeforeEach
    public void setup() {
        task = new _2812();
    }

    @Test
    void maximumSafenessFactorExample1() {
        assertThat(task.maximumSafenessFactor(twoDimArrayToListOfLists(new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 1}}))).isZero();
    }

    @Test
    void maximumSafenessFactorExample2() {
        assertThat(task.maximumSafenessFactor(twoDimArrayToListOfLists(new int[][]{{0, 0, 1}, {0, 0, 0}, {0, 0, 0}}))).isEqualTo(2);
    }

    @Test
    void maximumSafenessFactorExample3() {
        assertThat(task.maximumSafenessFactor(twoDimArrayToListOfLists(new int[][]{{0, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 0}}))).isEqualTo(2);
    }
}