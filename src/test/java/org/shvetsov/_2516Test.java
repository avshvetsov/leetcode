package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2516Test {

    private static _2516 task;

    @BeforeEach
    public void setup() {
        task = new _2516();
    }

    @Test
    void takeCharactersExample1() {
        assertThat(task.takeCharacters("aabaaaacaabc", 2)).isEqualTo(8);
    }

    @Test
    void takeCharactersExample2() {
        assertThat(task.takeCharacters("a", 1)).isEqualTo(-1);
    }
}