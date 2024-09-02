package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1894Test {

    private static _1894 task;

    @BeforeEach
    public void setup() {
        task = new _1894();
    }

    @Test
    void chalkReplacerExample1() {
        assertThat(task.chalkReplacer(new int[]{5, 1, 5}, 22)).isEqualTo(0);
    }

    @Test
    void chalkReplacerExample2() {
        assertThat(task.chalkReplacer(new int[]{3, 4, 1, 2}, 25)).isEqualTo(1);
    }
}