package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2516Test {

    private static _2516 task;
    private static _2516.NotEfficient taskNotEfficient;

    @BeforeEach
    public void setup() {
        task = new _2516();
        taskNotEfficient = new _2516.NotEfficient();
    }

    @Test
    void takeCharactersExample1() {
        assertThat(task.takeCharacters("aabaaaacaabc", 2)).isEqualTo(8);
    }

    @Test
    void takeCharactersExample2() {
        assertThat(task.takeCharacters("a", 1)).isEqualTo(-1);
    }

    @Test
    void takeCharactersTC95() {
        assertThat(task.takeCharacters("abc", 1)).isEqualTo(3);
    }

    @Test
    void takeCharactersTC139() {
        assertThat(task.takeCharacters("aabbccca", 2)).isEqualTo(6);
    }

    @Test
    void takeCharactersNotEfficientExample1() {
        assertThat(taskNotEfficient.takeCharacters("aabaaaacaabc", 2)).isEqualTo(8);
    }

    @Test
    void takeCharactersNotEfficientExample2() {
        assertThat(taskNotEfficient.takeCharacters("a", 1)).isEqualTo(-1);
    }

    @Test
    void takeCharactersNotEfficientTC95() {
        assertThat(taskNotEfficient.takeCharacters("abc", 1)).isEqualTo(3);
    }

    @Test
    void takeCharactersNotEfficientTC139() {
        assertThat(taskNotEfficient.takeCharacters("aabbccca", 2)).isEqualTo(6);
    }
}