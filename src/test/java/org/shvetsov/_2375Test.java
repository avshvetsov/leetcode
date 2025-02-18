package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2375Test {

    private static _2375 task;
    private static _2375.StackSolutionBottomUp taskStackSolutionBottomUp;
    private static _2375.StringSolution taskStringSolution;

    @BeforeEach
    public void setup() {
        task = new _2375();
        taskStackSolutionBottomUp = new _2375.StackSolutionBottomUp();
        taskStringSolution = new _2375.StringSolution();
    }

    @Test
    void smallestNumberExample1() {
        assertThat(task.smallestNumber("IIIDIDDD")).isEqualTo("123549876");
    }

    @Test
    void smallestNumberExample2() {
        assertThat(task.smallestNumber("DDD")).isEqualTo("4321");
    }
    @Test
    void smallestNumberStackSolutionBottomUpExample1() {
        assertThat(taskStackSolutionBottomUp.smallestNumber("IIIDIDDD")).isEqualTo("123549876");
    }

    @Test
    void smallestNumberStackSolutionBottomUpExample2() {
        assertThat(taskStackSolutionBottomUp.smallestNumber("DDD")).isEqualTo("4321");
    }
    @Test
    void smallestNumberStringSolutionExample1() {
        assertThat(taskStringSolution.smallestNumber("IIIDIDDD")).isEqualTo("123549876");
    }

    @Test
    void smallestNumberStringSolutionExample2() {
        assertThat(taskStringSolution.smallestNumber("DDD")).isEqualTo("4321");
    }

}