package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1Test {

    private static _1 task;

    @BeforeEach
    public void setup() {
        task = new _1();
    }

    @Test
    void maxProfit() {
        assertThat(task.twoSum(new int[]{3,2,4}, 6)).containsExactly(1,2);
        assertThat(task.twoSum(new int[]{2,7,11,15}, 9)).containsExactly(0,1);
        assertThat(task.twoSum(new int[]{3,3}, 6)).containsExactly(0,1);
    }

}