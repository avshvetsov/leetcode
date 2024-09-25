package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2416Test {

    private static _2416 task;

    @BeforeEach
    public void setup() {
        task = new _2416();
    }

    @Test
    void sumPrefixScoresExample1() {
        assertThat(task.sumPrefixScores(new String[]{"abc", "ab", "bc", "b"})).containsExactly(5, 4, 3, 2);
    }

    @Test
    void sumPrefixScoresExample2() {
        assertThat(task.sumPrefixScores(new String[]{"abcd"})).containsExactly(4);
    }
}