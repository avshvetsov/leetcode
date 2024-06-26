package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _648Test {

    private static _648 task;
    private static _648.TrieSolution taskTrieSolution;

    @BeforeEach
    public void setup() {
        task = new _648();
        taskTrieSolution = new _648.TrieSolution();
    }

    @Test
    void replaceWordsExample1() {
        assertThat(task.replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"))
                .isEqualTo("the cat was rat by the bat");
    }

    @Test
    void replaceWordsExample2() {
        assertThat(task.replaceWords(List.of("a","b","c"), "aadsfasf absbs bbab cadsfafs"))
                .isEqualTo("a a b c");
    }

    @Test
    void replaceWordsTC124() {
        assertThat(task.replaceWords(List.of("a", "aa", "aaa", "aaaa"), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"))
                .isEqualTo("a a a a a a a a bbb baba a");
    }

    @Test
    void replaceWordsTrieSolutionExample1() {
        assertThat(taskTrieSolution.replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"))
                .isEqualTo("the cat was rat by the bat");
    }

    @Test
    void replaceWordsTrieSolutionExample2() {
        assertThat(taskTrieSolution.replaceWords(List.of("a","b","c"), "aadsfasf absbs bbab cadsfafs"))
                .isEqualTo("a a b c");
    }

    @Test
    void replaceWordsTrieSolutionTC124() {
        assertThat(taskTrieSolution.replaceWords(List.of("a", "aa", "aaa", "aaaa"), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"))
                .isEqualTo("a a a a a a a a bbb baba a");
    }
}