package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2375Test {

    private static _2375 task;

    @BeforeEach
    public void setup() {
        task = new _2375();
    }

    @Test
    void smallestNumberExample1() {
        assertThat(task.smallestNumber("IIIDIDDD")).isEqualTo("123549876");
    }

    @Test
    void smallestNumberExample2() {
        assertThat(task.smallestNumber("DDD")).isEqualTo("4321");
    }

}