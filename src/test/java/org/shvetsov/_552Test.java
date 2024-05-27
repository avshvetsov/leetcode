package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _552Test {

    private static _552 task;
    private static _552.Recursion taskRecursion;

    @BeforeEach
    public void setup() {
        task = new _552();
        taskRecursion = new _552.Recursion();
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

    @Test
    void checkRecordTC4() {
        assertThat(task.checkRecord(4)).isEqualTo(43);
    }

    @Test
    void recursionCheckRecordExample1() {
        assertThat(taskRecursion.checkRecord(2)).isEqualTo(8);
    }

    @Test
    void recursionCheckRecordExample2() {
        assertThat(taskRecursion.checkRecord(1)).isEqualTo(3);
    }

    @Test
    void recursionCheckRecordExample3() {
        assertThat(taskRecursion.checkRecord(10101)).isEqualTo(183_236_316);
    }

    @Test
    void recursionCheckRecordTC4() {
        assertThat(taskRecursion.checkRecord(4)).isEqualTo(43);
    }
}