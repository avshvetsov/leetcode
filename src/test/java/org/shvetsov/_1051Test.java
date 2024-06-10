package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1051Test {

    private static _1051 task;

    @BeforeEach
    public void setup() {
        task = new _1051();
    }

    @Test
    void heightCheckerExample1() {
        assertThat(task.heightChecker(new int[]{1, 1, 4, 2, 1, 3})).isEqualTo(3);
    }

    @Test
    void heightCheckerExample2() {
        assertThat(task.heightChecker(new int[]{5, 1, 2, 3, 4})).isEqualTo(5);
    }

    @Test
    void heightCheckerExample3() {
        assertThat(task.heightChecker(new int[]{1, 2, 3, 4, 5})).isEqualTo(0);
    }
}