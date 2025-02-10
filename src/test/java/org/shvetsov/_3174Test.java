package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3174Test {

    private static _3174 task;

    @BeforeEach
    public void setup() {
        task = new _3174();
    }

    @Test
    void clearDigitsExample1() {
        assertThat(task.clearDigits("abc")).isEqualTo("abc");
    }

    @Test
    void clearDigitsExample2() {
        assertThat(task.clearDigits("cb34")).isEqualTo("");
    }

}