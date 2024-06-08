package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _523Test {

    private static _523 task;
    private static _523.TimeLimitExceeded taskTimeLimitExceeded;

    @BeforeEach
    public void setup() {
        task = new _523();
        taskTimeLimitExceeded = new _523.TimeLimitExceeded();
    }

    @Test
    void checkSubarraySumExample1() {
        assertThat(task.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6)).isTrue();
    }

    @Test
    void checkSubarraySumExample2() {
        assertThat(task.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6)).isTrue();
    }

    @Test
    void checkSubarraySumExample3() {
        assertThat(task.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13)).isFalse();
    }

    @Test
    void checkSubarraySumTC6() {
        assertThat(task.checkSubarraySum(new int[]{23, 2, 4, 6, 6}, 7)).isTrue();
    }

    @Test
    void checkSubarraySumTC95() {
        assertThat(task.checkSubarraySum(new int[]{0, 0}, 1)).isTrue();
    }

    @Test
    void checkSubarraySumTimeLimitExceededExample1() {
        assertThat(taskTimeLimitExceeded.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6)).isTrue();
    }

    @Test
    void checkSubarraySumTimeLimitExceededExample2() {
        assertThat(taskTimeLimitExceeded.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6)).isTrue();
    }

    @Test
    void checkSubarraySumTimeLimitExceededExample3() {
        assertThat(taskTimeLimitExceeded.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13)).isFalse();
    }
}