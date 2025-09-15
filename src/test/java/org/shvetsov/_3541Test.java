package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3541Test {

    private _3541 task;

    @BeforeEach
    public void setup() {
        this.task = new _3541();
    }

    @Test
    void maxFreqSumExample1() {
        assertThat(this.task.maxFreqSum("successes")).isEqualTo(6);
    }
    @Test
    void maxFreqSumExample2() {
        assertThat(this.task.maxFreqSum("aeiaeia")).isEqualTo(3);
    }

}