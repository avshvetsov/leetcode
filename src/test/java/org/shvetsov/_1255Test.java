package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1255Test {

    private static _1255 task;

    @BeforeEach
    public void setup() {
        task = new _1255();
    }

    @Test
    void maxScoreWordsExample1() {
        assertThat(task.maxScoreWords(new String[]{"dog", "cat", "dad", "good"}, new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'}, new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}))
                .isEqualTo(23);
    }

    @Test
    void maxScoreWordsExample2() {
        assertThat(task.maxScoreWords(new String[]{"xxxz", "ax", "bx", "cx"}, new char[]{'z', 'a', 'b', 'c', 'x', 'x', 'x'}, new int[]{4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10}))
                .isEqualTo(27);
    }

    @Test
    void maxScoreWordsExample3() {
        assertThat(task.maxScoreWords(new String[]{"leetcode"}, new char[]{'l', 'e', 't', 'c', 'o', 'd'}, new int[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0}))
                .isEqualTo(0);
    }
}