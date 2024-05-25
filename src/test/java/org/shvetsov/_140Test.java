package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _140Test {

    private static _140 task;

    @BeforeEach
    public void setup() {
        task = new _140();
    }

    @Test
    void wordBreakExample1() {
        assertThat(task.wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog")))
                .containsExactlyInAnyOrderElementsOf(List.of("cats and dog", "cat sand dog"));
    }
    @Test
    void wordBreakExample2() {
        assertThat(task.wordBreak("pineapplepenapple", List.of("apple","pen","applepen","pine","pineapple")))
                .containsExactlyInAnyOrderElementsOf(List.of("pine apple pen apple","pineapple pen apple","pine applepen apple"));
    }
    @Test
    void wordBreakExample3() {
        assertThat(task.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")))
                .containsExactlyInAnyOrderElementsOf(List.of());
    }
}