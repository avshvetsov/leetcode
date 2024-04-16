package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.classes.TreeNode;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.*;

class _623Test {

    private static _623 task;

    @BeforeEach
    public void setup() {
        task = new _623();
    }

    @Test
    void addOneRow() {
        assertThat(task.addOneRow(constructTreeNode(4, 2, 6, 3, 1, 5), 1, 2))
                .isEqualTo(constructTreeNode(4, 1, 1, 2, null, null, 6, 3, 1, 5));
        assertThat(task.addOneRow(constructTreeNode(4, 2, null, 3, 1), 1, 3))
                .isEqualTo(constructTreeNode(4, 2, null, 1, 1, 3, null, null, 1));
    }
}