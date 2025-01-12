package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2116Test {

    private static _2116 task;

    @BeforeEach
    public void setup() {
        task = new _2116();
    }

    @Test
    void canBeValidExample1() {
        assertThat(task.canBeValid("))()))", "010100")).isTrue();
    }
    @Test
    void canBeValidExample2() {
        assertThat(task.canBeValid("()()", "0000")).isTrue();
    }
    @Test
    void canBeValidExample3() {
        assertThat(task.canBeValid(")", "0")).isFalse();
    }
    @Test
    void canBeValidTC74() {
        assertThat(task.canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(", "100011110110011011010111100111011101111110000101001101001111")).isFalse();
    }
    @Test
    void canBeValidTC193() {
        assertThat(task.canBeValid("))()))", "010100")).isTrue();
    }
    @Test
    void canBeValidTC202() {
        assertThat(task.canBeValid("()", "11")).isTrue();
    }
}