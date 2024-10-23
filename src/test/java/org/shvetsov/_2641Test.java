package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.*;

class _2641Test {

    private static _2641 task;

    @BeforeEach
    public void setup() {
        task = new _2641();
    }

    @Test
    void replaceValueInTreeExample1() {
        assertThat(task.replaceValueInTree(constructTreeNode(5, 4, 9, 1, 10, null, 7))).isEqualTo(constructTreeNode(0, 0, 0, 7, 7, null, 11));
    }

    @Test
    void replaceValueInTreeExample2() {
        assertThat(task.replaceValueInTree(constructTreeNode(3,1,2))).isEqualTo(constructTreeNode(0, 0, 0));
    }
}