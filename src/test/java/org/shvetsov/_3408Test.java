package org.shvetsov;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _3408Test {

    @Test
    void TaskManagerExample1() {
        _3408.TaskManager taskManager = new _3408.TaskManager(List.of(List.of(1, 101, 10), List.of(2, 102, 20), List.of(3, 103, 15)));
        taskManager.add(4, 104, 5);
        taskManager.edit(102, 8);
        assertThat(taskManager.execTop()).isEqualTo(3);
        taskManager.rmv(101);
        taskManager.add(5, 105, 15);
        assertThat(taskManager.execTop()).isEqualTo(5);
    }

}