package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _648Test {

    private static _648 task;

    @BeforeEach
    public void setup() {
        task = new _648();
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
}