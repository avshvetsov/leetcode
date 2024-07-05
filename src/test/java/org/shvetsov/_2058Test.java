package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2058Test {

    private static _2058 task;
    private static _2058.withListOfCP taskwithListOfCP;

    @BeforeEach
    public void setup() {
        task = new _2058();
        taskwithListOfCP = new _2058.withListOfCP();
    }

    @Test
    void nodesBetweenCriticalPointsExample1() {
        assertThat(task.nodesBetweenCriticalPoints(LinkedListUtils.constructListNode(3, 1))).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void nodesBetweenCriticalPointsExample2() {
        assertThat(task.nodesBetweenCriticalPoints(LinkedListUtils.constructListNode(5, 3, 1, 2, 5, 1, 2))).isEqualTo(new int[]{1, 3});
    }

    @Test
    void nodesBetweenCriticalPointsExample3() {
        assertThat(task.nodesBetweenCriticalPoints(LinkedListUtils.constructListNode(1, 3, 2, 2, 3, 2, 2, 2, 7))).isEqualTo(new int[]{3, 3});
    }

    @Test
    void nodesBetweenCriticalPointsWithListOfCPExample1() {
        assertThat(taskwithListOfCP.nodesBetweenCriticalPoints(LinkedListUtils.constructListNode(3, 1))).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void nodesBetweenCriticalPointsWithListOfCPExample2() {
        assertThat(taskwithListOfCP.nodesBetweenCriticalPoints(LinkedListUtils.constructListNode(5, 3, 1, 2, 5, 1, 2))).isEqualTo(new int[]{1, 3});
    }

    @Test
    void nodesBetweenCriticalPointsWithListOfCPExample3() {
        assertThat(taskwithListOfCP.nodesBetweenCriticalPoints(LinkedListUtils.constructListNode(1, 3, 2, 2, 3, 2, 2, 2, 7))).isEqualTo(new int[]{3, 3});
    }
}