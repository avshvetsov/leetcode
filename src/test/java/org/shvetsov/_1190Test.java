package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1190Test {

    private static _1190 task;

    @BeforeEach
    public void setup() {
        task = new _1190();
    }

    @Test
    void reverseParenthesesExample1() {
        assertThat(task.reverseParentheses("(abcd)")).isEqualTo("dcba");
    }

    @Test
    void reverseParenthesesExample2() {
        assertThat(task.reverseParentheses("(u(love)i)")).isEqualTo("iloveu");
    }

    @Test
    void reverseParenthesesExample3() {
        assertThat(task.reverseParentheses("(ed(et(oc))el)")).isEqualTo("leetcode");
    }
}