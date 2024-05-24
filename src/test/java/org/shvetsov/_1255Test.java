package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1255Test {

    private static _1255 task;
    private static _1255.NotEfficient taskNotEfficient;

    @BeforeEach
    public void setup() {
        task = new _1255();
        taskNotEfficient = new _1255.NotEfficient();
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

    @Test
    void maxScoreWordsTC17() {
        assertThat(task.maxScoreWords(new String[]{"add", "dda", "bb", "ba", "add"}, new char[]{'a', 'a', 'a', 'a', 'b', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd'}, new int[]{3, 9, 8, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}))
                .isEqualTo(51);
    }

    @Test
    void maxScoreWordsTC44() {
        assertThat(task.maxScoreWords(new String[]{"dadpqgrgmbobf", "oiopldkigoeqlf", "hsdetqbhkakinrr", "defmsjpmjf", "oimpdaoahq", "dsnarkpghmd", "bnmlhgmhjb", "alfniljbjja", "ilpebhlaab", "ifhdqmsjos", "cpjiassqems"},
                new char[]{'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'g', 'g', 'g', 'h', 'h', 'h', 'i', 'i', 'j', 'k', 'k', 'k', 'k', 'l', 'l', 'l', 'm', 'm', 'm', 'm', 'n', 'o', 'o', 'p', 'p', 'p', 'q', 'r', 'r', 's', 's', 't', 't', 't'},
                new int[]{4, 9, 2, 6, 6, 9, 10, 3, 9, 1, 8, 7, 7, 5, 7, 8, 4, 5, 3, 10, 0, 0, 0, 0, 0, 0}))
                .isEqualTo(61);
    }

    @Test
    void taskNotEfficientmaxScoreWordsExample1() {
        assertThat(taskNotEfficient.maxScoreWords(new String[]{"dog", "cat", "dad", "good"}, new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'}, new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}))
                .isEqualTo(23);
    }

    @Test
    void taskNotEfficientmaxScoreWordsExample2() {
        assertThat(taskNotEfficient.maxScoreWords(new String[]{"xxxz", "ax", "bx", "cx"}, new char[]{'z', 'a', 'b', 'c', 'x', 'x', 'x'}, new int[]{4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10}))
                .isEqualTo(27);
    }

    @Test
    void taskNotEfficientmaxScoreWordsExample3() {
        assertThat(taskNotEfficient.maxScoreWords(new String[]{"leetcode"}, new char[]{'l', 'e', 't', 'c', 'o', 'd'}, new int[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0}))
                .isEqualTo(0);
    }
}