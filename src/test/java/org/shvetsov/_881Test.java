package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _881Test {

    private static _881 task;

    @BeforeEach
    public void setup() {
        task = new _881();
    }

    @Test
    void numRescueBoats() {
        assertThat(task.numRescueBoats(new int[]{1, 2}, 3)).isEqualTo(1);
        assertThat(task.numRescueBoats(new int[]{3, 2, 2, 1}, 3)).isEqualTo(3);
        assertThat(task.numRescueBoats(new int[]{3, 5, 3, 4}, 5)).isEqualTo(4);
    }

    @Test
    void numRescueBoats1() {
        assertThat(task.numRescueBoats(new int[]{3,2,3,2,2}, 6)).isEqualTo(3);
    }
}