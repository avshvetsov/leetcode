package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3075Test {

    private static _3075 task;

    @BeforeEach
    public void setup() {
        task = new _3075();
    }

    @Test
    void maximumHappinessSum() {
        assertThat(task.maximumHappinessSum(new int[]{1, 2, 3}, 2)).isEqualTo(4);
        assertThat(task.maximumHappinessSum(new int[]{1, 1, 1, 1}, 2)).isEqualTo(1);
        assertThat(task.maximumHappinessSum(new int[]{2, 3, 4, 5}, 1)).isEqualTo(5);
    }
}