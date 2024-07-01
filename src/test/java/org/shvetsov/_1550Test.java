package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1550Test {

    private static _1550 task;

    @BeforeEach
    public void setup() {
        task = new _1550();
    }

    @Test
    void threeConsecutiveOddsExample1() {
        assertThat(task.threeConsecutiveOdds(new int[]{2, 6, 4, 1})).isFalse();
    }

    @Test
    void threeConsecutiveOddsExample2() {
        assertThat(task.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12})).isTrue();
    }
}