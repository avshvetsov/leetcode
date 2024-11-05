package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2914Test {

    private static _2914 task;

    @BeforeEach
    public void setup() {
        task = new _2914();
    }

    @Test
    void minChangesExample1() {
        assertThat(task.minChanges("1001")).isEqualTo(2);
    }
    @Test
    void minChangesExample2() {
        assertThat(task.minChanges("10")).isEqualTo(1);
    }
    @Test
    void minChangesExample3() {
        assertThat(task.minChanges("00")).isEqualTo(0);
    }
}