package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _786Test {

    private static _786 task;

    @BeforeEach
    public void setup() {
        task = new _786();
    }

    @Test
    void kthSmallestPrimeFraction() {
        assertThat(task.kthSmallestPrimeFraction(new int[]{1, 2, 3, 5}, 3)).isEqualTo(new int[]{2, 5});
        assertThat(task.kthSmallestPrimeFraction(new int[]{1, 7}, 1)).isEqualTo(new int[]{1, 7});
    }
}