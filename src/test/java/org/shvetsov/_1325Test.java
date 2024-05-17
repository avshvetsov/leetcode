package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.constructTreeNode;

class _1325Test {

    private static _1325 task;

    @BeforeEach
    public void setup() {
        task = new _1325();
    }

    @Test
    void removeLeafNodesExample1() {
        assertThat(task.removeLeafNodes(constructTreeNode(1, 2, 3, 2, null, 2, 4), 2)).isEqualTo(constructTreeNode(1, null, 3, null, 4));
    }

    @Test
    void removeLeafNodesExample2() {
        assertThat(task.removeLeafNodes(constructTreeNode(1, 3, 3, 3, 2), 3)).isEqualTo(constructTreeNode(1, 3, null, null, 2));
    }

    @Test
    void removeLeafNodesExample3() {
        assertThat(task.removeLeafNodes(constructTreeNode(1, 2, null, 2, null, 2), 2)).isEqualTo(constructTreeNode(1));
    }
}