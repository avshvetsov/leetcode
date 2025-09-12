package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2785Test {

    private _2785 task;

    @BeforeEach
    public void setup() {
        this.task = new _2785();
    }

    @Test
    void sortVowelsExample1() {
        assertThat(task.sortVowels("lEetcOde")).isEqualTo("lEOtcede");
    }
    @Test
    void sortVowelsExample2() {
        assertThat(task.sortVowels("lYmpH")).isEqualTo("lYmpH");
    }
}