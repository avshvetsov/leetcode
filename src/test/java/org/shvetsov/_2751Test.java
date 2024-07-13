package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _2751Test {

    private static _2751 task;
    private static _2751.NoInnerClass taskNoInnerClass;

    @BeforeEach
    public void setup() {
        task = new _2751();
        taskNoInnerClass = new _2751.NoInnerClass();
    }

    @Test
    void survivedRobotsHealthsExample1() {
        assertThat(task.survivedRobotsHealths(new int[]{5, 4, 3, 2, 1}, new int[]{2, 17, 9, 15, 10}, "RRRRR"))
                .isEqualTo(List.of(2, 17, 9, 15, 10));
    }

    @Test
    void survivedRobotsHealthsExample2() {
        assertThat(task.survivedRobotsHealths(new int[]{3, 5, 2, 6}, new int[]{10, 10, 15, 12}, "RLRL"))
                .isEqualTo(List.of(14));
    }

    @Test
    void survivedRobotsHealthsExample3() {
        assertThat(task.survivedRobotsHealths(new int[]{1, 2, 5, 6}, new int[]{10, 10, 11, 11}, "RLRL"))
                .isEqualTo(List.of());
    }
    @Test
    void survivedRobotsHealthsNoInnerClassExample1() {
        assertThat(taskNoInnerClass.survivedRobotsHealths(new int[]{5, 4, 3, 2, 1}, new int[]{2, 17, 9, 15, 10}, "RRRRR"))
                .isEqualTo(List.of(2, 17, 9, 15, 10));
    }

    @Test
    void survivedRobotsHealthsNoInnerClassExample2() {
        assertThat(taskNoInnerClass.survivedRobotsHealths(new int[]{3, 5, 2, 6}, new int[]{10, 10, 15, 12}, "RLRL"))
                .isEqualTo(List.of(14));
    }

    @Test
    void survivedRobotsHealthsNoInnerClassExample3() {
        assertThat(taskNoInnerClass.survivedRobotsHealths(new int[]{1, 2, 5, 6}, new int[]{10, 10, 11, 11}, "RLRL"))
                .isEqualTo(List.of());
    }
}