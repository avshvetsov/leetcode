package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _525Test {

    private _525 task;

    @BeforeEach
    public void setup() {
        task = new _525();
    }

    @Test
    void findMaxLength() {
        assertThat(task.findMaxLength(new int[]{0, 1})).isEqualTo(2);
        assertThat(task.findMaxLength(new int[]{0, 1, 0})).isEqualTo(2);
    }

    @Test
    void findMaxLength2() {
        assertThat(task.findMaxLength(new int[]{1, 0, 0, 0, 1})).isEqualTo(2);
        assertThat(task.findMaxLength(new int[]{1, 0, 0, 1, 0, 0, 1})).isEqualTo(4);
    }
}