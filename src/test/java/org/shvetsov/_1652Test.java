package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1652Test {

    private static _1652 task;
    private static _1652.SlidingWindow taskSlidingWindow;

    @BeforeEach
    public void setup() {
        task = new _1652();
        taskSlidingWindow = new _1652.SlidingWindow();
    }

    @Test
    void decryptExample1() {
        assertThat(task.decrypt(new int[]{5, 7, 1, 4}, 3)).containsExactly(12, 10, 16, 13);
    }

    @Test
    void decryptExample2() {
        assertThat(task.decrypt(new int[]{1, 2, 3, 4}, 0)).containsExactly(0, 0, 0, 0);
    }

    @Test
    void decryptExample3() {
        assertThat(task.decrypt(new int[]{2, 4, 9, 3}, -2)).containsExactly(12, 5, 6, 13);
    }

    @Test
    void decryptSlidingWindowExample1() {
        assertThat(taskSlidingWindow.decrypt(new int[]{5, 7, 1, 4}, 3)).containsExactly(12, 10, 16, 13);
    }

    @Test
    void decryptSlidingWindowExample2() {
        assertThat(taskSlidingWindow.decrypt(new int[]{1, 2, 3, 4}, 0)).containsExactly(0, 0, 0, 0);
    }

    @Test
    void decryptSlidingWindowExample3() {
        assertThat(taskSlidingWindow.decrypt(new int[]{2, 4, 9, 3}, -2)).containsExactly(12, 5, 6, 13);
    }
}