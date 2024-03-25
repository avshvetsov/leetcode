package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _442Test {

    private static _442 task;

    @BeforeEach
    public void setup() {
        task = new _442();
    }

    @Test
    void findDuplicates() {
        assertThat(task.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1})).containsOnly(2, 3);
        assertThat(task.findDuplicates(new int[]{1, 1, 2})).containsOnly(1);
        assertThat(task.findDuplicates(new int[]{1})).isEmpty();
    }
}