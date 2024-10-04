package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2491Test {

    private static _2491 task;

    @BeforeEach
    public void setup() {
        task = new _2491();
    }

    @Test
    void dividePlayersExample1() {
        assertThat(task.dividePlayers(new int[]{3, 2, 5, 1, 3, 4})).isEqualTo(22);
    }

    @Test
    void dividePlayersExample2() {
        assertThat(task.dividePlayers(new int[]{3, 4})).isEqualTo(12);
    }

    @Test
    void dividePlayersExample3() {
        assertThat(task.dividePlayers(new int[]{1, 1, 2, 3})).isEqualTo(-1);
    }
}