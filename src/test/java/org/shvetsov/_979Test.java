package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.classes.TreeNode;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.*;

class _979Test {

    private static _979 task;

    @BeforeEach
    public void setup() {
        task = new _979();
    }

    @Test
    void distributeCoinsExample1() {
        assertThat(task.distributeCoins(constructTreeNode(3, 0, 0))).isEqualTo(2);
    }

    @Test
    void distributeCoinsExample2() {
        assertThat(task.distributeCoins(constructTreeNode(0, 3, 0))).isEqualTo(3);
    }

    @Test
    void distributeCoinsTest18() {
        TreeNode root = constructTreeNode(4, 0, null, null, 0, null, 0);
        System.out.println(root);
        assertThat(task.distributeCoins(root)).isEqualTo(6);
    }

    @Test
    void distributeCoinsTest69() {
        TreeNode root = constructTreeNode(0,1,1,null,null,1,0,null,1,null,4,null,0);
        System.out.println(root);
        assertThat(task.distributeCoins(root)).isEqualTo(9);
    }
}