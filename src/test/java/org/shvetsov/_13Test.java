package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _13Test {

    private static _13 task;

    @BeforeEach
    public void setup() {
        task = new _13();
    }

    @Test
    void romanToInt() {
        assertThat(task.romanToInt("III")).isEqualTo(3);
        assertThat(task.romanToInt("LVIII")).isEqualTo(58);
        assertThat(task.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}