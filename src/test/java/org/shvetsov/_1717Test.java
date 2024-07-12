package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1717Test {

    private static _1717 task;

    @BeforeEach
    public void setup() {
        task = new _1717();
    }

    @Test
    void maximumGainExample1() {
        assertThat(task.maximumGain("cdbcbbaaabab", 4, 5)).isEqualTo(19);
    }

    @Test
    void maximumGainExample2() {
        assertThat(task.maximumGain("aabbaaxybbaabb", 5, 4)).isEqualTo(20);
    }
}