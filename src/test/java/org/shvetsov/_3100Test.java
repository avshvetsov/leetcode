package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3100Test {

    private static _3100 task;

    @BeforeEach
    public void setup() {
        task = new _3100();
    }

    @Test
    void maxBottlesDrunkExample1() {
        assertThat(task.maxBottlesDrunk(13, 6)).isEqualTo(15);
    }

    @Test
    void maxBottlesDrunkExample2() {
        assertThat(task.maxBottlesDrunk(10, 3)).isEqualTo(13);
    }
}