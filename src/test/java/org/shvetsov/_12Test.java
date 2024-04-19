package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _12Test {

    private static _12 task;

    @BeforeEach
    public void setup() {
        task = new _12();
    }

    @Test
    void intToRoman() {
        assertThat(task.intToRoman(3)).isEqualTo("III");
        assertThat(task.intToRoman(58)).isEqualTo("LVIII");
        assertThat(task.intToRoman(1994)).isEqualTo("MCMXCIV");
    }
}