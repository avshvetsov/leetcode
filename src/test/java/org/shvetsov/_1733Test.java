package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1733Test {

    private _1733 task;

    @BeforeEach
    public void setup() {
        this.task = new _1733();
    }

    @Test
    void minimumTeachingsExample1() {
        assertThat(task.minimumTeachings(2, new int[][]{{1}, {2}, {1, 2}}, new int[][]{{1, 2}, {1, 3}, {2, 3}})).isEqualTo(1);
    }

    @Test
    void minimumTeachingsExample2() {
        assertThat(task.minimumTeachings(3, new int[][]{{2}, {1, 3}, {1, 2}, {3}}, new int[][]{{1, 4}, {1, 2}, {3, 4}, {2, 3}})).isEqualTo(2);
    }
}