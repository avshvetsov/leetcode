package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3516Test {

    private _3516 task;

    @BeforeEach
    public void setup() {
        this.task = new _3516();
    }

    @Test
    void findClosestExample1() {
        assertThat(task.findClosest(2, 7, 4)).isEqualTo(1);
    }

    @Test
    void findClosestExample2() {
        assertThat(task.findClosest(2, 5, 6)).isEqualTo(2);
    }

    @Test
    void findClosestExample3() {
        assertThat(task.findClosest(1, 5, 3)).isEqualTo(0);
    }
}