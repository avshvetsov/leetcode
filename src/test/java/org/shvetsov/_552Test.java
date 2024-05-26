package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _552Test {

    private static _552 task;

    @BeforeEach
    public void setup() {
        task = new _552();
    }

    @Test
    void checkRecordExample1() {
        assertThat(task.checkRecord(2)).isEqualTo(8);
    }

    @Test
    void checkRecordExample2() {
        assertThat(task.checkRecord(1)).isEqualTo(3);
    }

    @Test
    void checkRecordExample3() {
        assertThat(task.checkRecord(10101)).isEqualTo(183_236_316);
    }
}