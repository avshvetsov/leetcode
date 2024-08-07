package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _273Test {

    private static _273 task;

    @BeforeEach
    public void setup() {
        task = new _273();
    }

    @Test
    void numberToWordsExample1() {
        assertThat(task.numberToWords(123)).isEqualTo("One Hundred Twenty Three");
    }
    @Test
    void numberToWordsExample2() {
        assertThat(task.numberToWords(12345)).isEqualTo("Twelve Thousand Three Hundred Forty Five");
    }
    @Test
    void numberToWordsExample3() {
        assertThat(task.numberToWords(1234567)).isEqualTo("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven");
    }
}