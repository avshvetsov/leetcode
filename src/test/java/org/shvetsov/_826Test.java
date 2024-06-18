package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _826Test {

    private static _826 task;
    private static _826.Memorization taskMemorization;

    @BeforeEach
    public void setup() {
        task = new _826();
        taskMemorization = new _826.Memorization();
    }

    @Test
    void maxProfitAssignmentExample1() {
        assertThat(task.maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7}))
                .isEqualTo(100);
    }

    @Test
    void maxProfitAssignmentExample2() {
        assertThat(task.maxProfitAssignment(new int[]{85, 47, 57}, new int[]{24, 66, 99}, new int[]{40, 25, 25}))
                .isEqualTo(0);
    }
    @Test
    void maxProfitAssignmentMemoExample1() {
        assertThat(taskMemorization.maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7}))
                .isEqualTo(100);
    }

    @Test
    void maxProfitAssignmentMemoExample2() {
        assertThat(taskMemorization.maxProfitAssignment(new int[]{85, 47, 57}, new int[]{24, 66, 99}, new int[]{40, 25, 25}))
                .isEqualTo(0);
    }

    @Test
    void maxProfitAssignmentMemoTC56() {
        assertThat(taskMemorization.maxProfitAssignment(new int[]{66,1,28,73,53,35,45,60,100,44,59,94,27,88,7,18,83,18,72,63},
                new int[]{66,20,84,81,56,40,37,82,53,45,43,96,67,27,12,54,98,19,47,77},
                new int[]{61,33,68,38,63,45,1,10,53,23,66,70,14,51,94,18,28,78,100,16}))
                .isEqualTo(1392);
    }
}