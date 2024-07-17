package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.constructTreeNode;

class _1110Test {

    private static _1110 task;

    @BeforeEach
    public void setup() {
        task = new _1110();
    }

    @Test
    void delNodesExample1() {
        assertThat(task.delNodes(constructTreeNode(1, 2, 3, 4, 5, 6, 7), new int[]{3, 5}))
                .hasSameElementsAs(
                        List.of(constructTreeNode(1, 2, null, 4),
                                constructTreeNode(6),
                                constructTreeNode(7))
                );
    }

    @Test
    void delNodesExample2() {
        assertThat(task.delNodes(constructTreeNode(1, 2, 4, null, 3), new int[]{3}))
                .hasSameElementsAs(List.of(constructTreeNode(1, 2, 4)));
    }
}