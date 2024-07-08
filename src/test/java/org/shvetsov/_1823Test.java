package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1823Test {

    private static _1823 task;

    @BeforeEach
    public void setup() {
        task = new _1823();
    }

    @Test
    void findTheWinnerExample1() {
        assertThat(task.findTheWinner(5, 2)).isEqualTo(3);
    }

    @Test
    void findTheWinnerExample2() {
        assertThat(task.findTheWinner(6, 5)).isEqualTo(1);
    }
}