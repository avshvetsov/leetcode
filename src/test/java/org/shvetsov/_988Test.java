package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _988Test {

    private static _988 task;

    @BeforeEach
    public void setup() {
        task = new _988();
    }


    @Test
    void smallestFromLeaf() {
        assertThat(task.smallestFromLeaf(TreeUtils.constructTreeNode(0, 1, 2, 3, 4, 3, 4))).isEqualTo("dba");
        assertThat(task.smallestFromLeaf(TreeUtils.constructTreeNode(25, 1, 3, 1, 3, 0, 2))).isEqualTo("adz");
        assertThat(task.smallestFromLeaf(TreeUtils.constructTreeNode(2, 2, 1, null, 1, 0, null, 0))).isEqualTo("abc");
    }

    @Test
    void smallestFromLeaf1() {
        assertThat(task.smallestFromLeaf(TreeUtils.constructTreeNode(3, 9, 20, null, null, 15, 7))).isEqualTo("hud");
    }
}