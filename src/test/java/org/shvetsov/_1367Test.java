package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _1367Test {

    private static _1367 task;

    @BeforeEach
    public void setup() {
        task = new _1367();
    }

    @Test
    void isSubPathExample1() {
        assertThat(task.isSubPath(LinkedListUtils.constructListNode(4, 2, 8),
                TreeUtils.constructTreeNode(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3)))
                .isTrue();
    }

    @Test
    void isSubPathExample2() {
        assertThat(task.isSubPath(LinkedListUtils.constructListNode(1, 4, 2, 6),
                TreeUtils.constructTreeNode(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3)))
                .isTrue();
    }

    @Test
    void isSubPathExample3() {
        assertThat(task.isSubPath(LinkedListUtils.constructListNode(1, 4, 2, 6, 8),
                TreeUtils.constructTreeNode(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3)))
                .isFalse();
    }
}