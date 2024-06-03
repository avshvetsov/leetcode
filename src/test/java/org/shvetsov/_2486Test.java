package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2486Test {

    private static _2486 task;

    @BeforeEach
    public void setup() {
        task = new _2486();
    }

    @Test
    void appendCharactersExample1() {
        assertThat(task.appendCharacters("coaching", "coding")).isEqualTo(4);
    }
    @Test
    void appendCharactersExample2() {
        assertThat(task.appendCharacters("abcde", "a")).isEqualTo(0);
    }
    @Test
    void appendCharactersExample3() {
        assertThat(task.appendCharacters("z", "abcde")).isEqualTo(5);
    }
}