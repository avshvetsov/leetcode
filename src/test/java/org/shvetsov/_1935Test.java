package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1935Test {

    private _1935 task;

    @BeforeEach
    public void setup() {
        this.task = new _1935();
    }

    @Test
    void canBeTypedWordsExample1() {
        assertThat(this.task.canBeTypedWords("hello world", "ad")).isEqualTo(1);
    }
    @Test
    void canBeTypedWordsExample2() {
        assertThat(this.task.canBeTypedWords("leet code", "lt")).isEqualTo(1);
    }
    @Test
    void canBeTypedWordsExample3() {
        assertThat(this.task.canBeTypedWords("leet code", "e")).isEqualTo(0);
    }
}