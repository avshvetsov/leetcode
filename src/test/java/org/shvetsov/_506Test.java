package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _506Test {

    private static _506 task;

    @BeforeEach
    public void setup() {
        task = new _506();
    }

    @Test
    void findRelativeRanks() {
        assertThat(task.findRelativeRanks(new int[]{5, 4, 3, 2, 1})).isEqualTo(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"});
        assertThat(task.findRelativeRanks(new int[]{10, 3, 8, 9, 4})).isEqualTo(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"});
    }
}