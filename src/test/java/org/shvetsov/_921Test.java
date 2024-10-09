package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _921Test {

    private static _921 task;

    @BeforeEach
    public void setup() {
        task = new _921();
    }

    @Test
    void minAddToMakeValidExample1() {
        assertThat(task.minAddToMakeValid("())")).isEqualTo(1);
    }

    @Test
    void minAddToMakeValidExample2() {
        assertThat(task.minAddToMakeValid("(((")).isEqualTo(3);
    }
}