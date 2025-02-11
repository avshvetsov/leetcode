package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1910Test {

    private static _1910 task;

    @BeforeEach
    public void setup() {
        task = new _1910();
    }

    @Test
    void removeOccurrencesExample1() {
        assertThat(task.removeOccurrences("daabcbaabcbc", "abc")).isEqualTo("dab");
    }

    @Test
    void removeOccurrencesExample2() {
        assertThat(task.removeOccurrences("axxxxyyyyb", "xy")).isEqualTo("ab");
    }

}