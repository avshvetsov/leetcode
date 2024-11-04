package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2490Test {

    private static _2490 task;

    @BeforeEach
    public void setup() {
        task = new _2490();
    }

    @Test
    void isCircularSentenceExample1() {
        assertThat(task.isCircularSentence("leetcode exercises sound delightful")).isTrue();
    }
    @Test
    void isCircularSentenceExample2() {
        assertThat(task.isCircularSentence("eetcode")).isTrue();
    }
    @Test
    void isCircularSentenceExample3() {
        assertThat(task.isCircularSentence("Leetcode is cool")).isFalse();
    }
}