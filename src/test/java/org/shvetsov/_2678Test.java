package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2678Test {

    private static _2678 task;

    @BeforeEach
    public void setup() {
        task = new _2678();
    }

    @Test
    void countSeniorsExample1() {
        assertThat(task.countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"})).isEqualTo(2);
    }
    @Test
    void countSeniorsExample2() {
        assertThat(task.countSeniors(new String[]{"1313579440F2036","2921522980M5644"})).isEqualTo(0);
    }
}