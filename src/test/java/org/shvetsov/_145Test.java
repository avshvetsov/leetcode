package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _145Test {

    private static _145 task;

    @BeforeEach
    public void setup() {
        task = new _145();
    }

    @Test
    void postorderTraversalExample1() {
        assertThat(task.postorderTraversal(TreeUtils.constructTreeNode(1, null, 2, 3)))
                .containsExactly(3, 2, 1);
    }
    @Test
    void postorderTraversalExample2() {
        assertThat(task.postorderTraversal(TreeUtils.constructTreeNode()))
                .isEmpty();
    }
    @Test
    void postorderTraversalExample3() {
        assertThat(task.postorderTraversal(TreeUtils.constructTreeNode(1)))
                .containsExactly(1);
    }
}