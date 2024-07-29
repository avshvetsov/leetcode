package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1395Test {

    private static _1395 task;

    @BeforeEach
    public void setup() {
        task = new _1395();
    }

    @Test
    void numTeamsExample1() {
        assertThat(task.numTeams(new int[]{2, 5, 3, 4, 1})).isEqualTo(3);
    }

    @Test
    void numTeamsExample2() {
        assertThat(task.numTeams(new int[]{2, 1, 3})).isEqualTo(0);
    }

    @Test
    void numTeamsExample3() {
        assertThat(task.numTeams(new int[]{1, 2, 3, 4})).isEqualTo(4);
    }
}