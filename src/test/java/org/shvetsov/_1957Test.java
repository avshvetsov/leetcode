package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1957Test {

    private static _1957 task;

    @BeforeEach
    public void setup() {
        task = new _1957();
    }

    @Test
    void makeFancyStringExample1() {
        assertThat(task.makeFancyString("leeetcode")).isEqualTo("leetcode");
    }
    @Test
    void makeFancyStringExample2() {
        assertThat(task.makeFancyString("aaabaaaa")).isEqualTo("aabaa");
    }
    @Test
    void makeFancyStringExample3() {
        assertThat(task.makeFancyString("aab")).isEqualTo("aab");
    }
}