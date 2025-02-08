package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2349Test {

    private static _2349.NumberContainers task;

    @BeforeEach
    public void setup() {
        task = new _2349.NumberContainers();
    }

    @Test
    void NumberContainersExample1() {
        assertThat(task.find(10)).isEqualTo(-1);
        task.change(2, 10);
        task.change(1, 10);
        task.change(3, 10);
        task.change(5, 10);
        assertThat(task.find(10)).isEqualTo(1);
        task.change(1, 20);
        assertThat(task.find(10)).isEqualTo(2);
    }

}