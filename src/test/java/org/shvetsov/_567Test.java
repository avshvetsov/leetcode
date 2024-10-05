package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _567Test {

    private static _567 task;

    @BeforeEach
    public void setup() {
        task = new _567();
    }

    @Test
    void checkInclusionExample1() {
        assertThat(task.checkInclusion("ab", "eidbaooo")).isTrue();
    }

    @Test
    void checkInclusionExample2() {
        assertThat(task.checkInclusion("ab", "eidboaoo")).isFalse();
    }
}