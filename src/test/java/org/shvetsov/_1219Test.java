package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1219Test {

    private static _1219 task;

    @BeforeEach
    public void setup() {
        task = new _1219();
    }

    @Test
    void getMaximumGold() {
        assertThat(task.getMaximumGold(new int[][]{{0, 6, 0}, {5, 8, 7}, {0, 9, 0}})).isEqualTo(24);
        assertThat(task.getMaximumGold(new int[][]{{1, 0, 7}, {2, 0, 6}, {3, 4, 5}, {0, 3, 0}, {9, 0, 20}})).isEqualTo(28);
    }

    @Test
    void getMaximumGold1() {
        assertThat(task.getMaximumGold(new int[][]{{1, 0, 7, 0, 0, 0}, {2, 0, 6, 0, 1, 0}, {3, 5, 6, 7, 4, 2}, {4, 3, 1, 0, 2, 0}, {3, 0, 5, 0, 20, 0}})).isEqualTo(60);
    }
}