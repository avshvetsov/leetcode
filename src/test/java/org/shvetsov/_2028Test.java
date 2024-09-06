package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2028Test {

    private static _2028 task;

    @BeforeEach
    public void setup() {
        task = new _2028();
    }


    @Test
    void missingRollsExample1() {
        assertThat(task.missingRolls(new int[]{3, 2, 4, 3}, 4, 2)).isEqualTo(new int[]{6, 6});
    }

    @Test
    void missingRollsExample2() {
        assertThat(task.missingRolls(new int[]{1,5,6}, 3, 4)).isEqualTo(new int[]{2,3,2,2});
    }

    @Test
    void missingRollsExample3() {
        assertThat(task.missingRolls(new int[]{1,2,3,4}, 6, 4)).isEqualTo(new int[0]);
    }
}