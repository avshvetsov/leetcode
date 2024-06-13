package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2037Test {

    private static _2037 task;

    @BeforeEach
    public void setup() {
        task = new _2037();
    }

    @Test
    void minMovesToSeatExample1() {
        assertThat(task.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4})).isEqualTo(4);
    }

    @Test
    void minMovesToSeatExample2() {
        assertThat(task.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6})).isEqualTo(7);
    }

    @Test
    void minMovesToSeatExample3() {
        assertThat(task.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6})).isEqualTo(4);
    }
}