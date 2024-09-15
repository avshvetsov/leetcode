package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1371Test {

    private static _1371 task;

    @BeforeEach
    public void setup() {
        task = new _1371();
    }

    @Test
    void findTheLongestSubstringExample1() {
        assertThat(task.findTheLongestSubstring("eleetminicoworoep")).isEqualTo(13);
    }
    @Test
    void findTheLongestSubstringExample2() {
        assertThat(task.findTheLongestSubstring("leetcodeisgreat")).isEqualTo(5);
    }
    @Test
    void findTheLongestSubstringExample3() {
        assertThat(task.findTheLongestSubstring("bcbcbc")).isEqualTo(6);
    }
}