package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _514Test {

    private static _514 task;
    private static _514.Improvements taskImprovements;

    @BeforeEach
    public void setup() {
        task = new _514();
        taskImprovements = new _514.Improvements();
    }

    @Test
    void findRotateSteps() {
        assertThat(task.findRotateSteps("godding", "gd")).isEqualTo(4);
        assertThat(task.findRotateSteps("godding", "godding")).isEqualTo(13);
    }

    @Test
    void findRotateStepsImproovments() {
        assertThat(taskImprovements.findRotateSteps("godding", "gd")).isEqualTo(4);
        assertThat(taskImprovements.findRotateSteps("godding", "godding")).isEqualTo(13);
    }
}