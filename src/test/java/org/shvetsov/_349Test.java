package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _349Test {

    private static _349 task;

    @BeforeEach
    public void setup() {
        task = new _349();
    }

    @Test
    void intersection() {
        assertThat(task.intersection(new int[]{1, 2, 2, 1}, new int[]{1, 2, 2, 1})).containsExactly(2);
        assertThat(task.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})).containsExactlyInAnyOrder(4, 9);
    }
}