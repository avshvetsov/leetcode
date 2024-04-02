package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _58Test {

    private static _58 task;

    @BeforeEach
    public void setup() {
        task = new _58();
    }
    @Test
    void lengthOfLastWord() {
        assertThat(task.lengthOfLastWord("Hello World")).isEqualTo(5);
        assertThat(task.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
        assertThat(task.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
    }
}