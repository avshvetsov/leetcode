package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _121Test {

    private static _121 task;

    @BeforeEach
    public void setup() {
        task = new _121();
    }

    @Test
    void maxProfit() {
        assertThat(task.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        assertThat(task.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }

}