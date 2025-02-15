package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2698Test {

    private static _2698 task;

    @BeforeEach
    public void setup() {
        task = new _2698();
    }

    @Test
    void punishmentNumberExample1() {
        assertThat(task.punishmentNumber(10)).isEqualTo(182);
    }

    @Test
    void punishmentNumberExample2() {
        assertThat(task.punishmentNumber(37)).isEqualTo(1478);
    }

}