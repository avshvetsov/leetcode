package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1915Test {

    private static _1915 task;

    @BeforeEach
    public void setup() {
        task = new _1915();
    }

    @Test
    void wonderfulSubstrings() {
//        assertThat(task.wonderfulSubstrings("aba")).isEqualTo(4);
        assertThat(task.wonderfulSubstrings("aabb")).isEqualTo(9);
        assertThat(task.wonderfulSubstrings("he")).isEqualTo(2);
    }

}