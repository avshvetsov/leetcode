package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _4Test {

    private static _4 task;

    @BeforeEach
    public void setup() {
        task = new _4();
    }

    @Test
    void findMedianSortedArrays() {
        assertThat(task.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isEqualTo(2.00);
        assertThat(task.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(2.50);
    }
}