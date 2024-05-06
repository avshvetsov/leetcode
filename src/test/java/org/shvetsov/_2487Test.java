package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.LinkedListUtils.*;

class _2487Test {

    private static _2487 task;

    @BeforeEach
    public void setup() {
        task = new _2487();
    }

    @Test
    void removeNodes() {
        assertThat(task.removeNodes(constructListNode(5, 2, 13, 3, 8))).isEqualTo(constructListNode(13, 8));
        assertThat(task.removeNodes(constructListNode(1, 1, 1, 1))).isEqualTo(constructListNode(1, 1, 1, 1));
    }
}