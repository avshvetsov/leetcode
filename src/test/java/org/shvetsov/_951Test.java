package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.*;

class _951Test {

    private static _951 task;

    @BeforeEach
    public void setup() {
        task = new _951();
    }

    @Test
    void flipEquivExample1() {
        assertThat(task.flipEquiv(constructTreeNode(1, 2, 3, 4, 5, 6, null, null, null, 7, 8), constructTreeNode(1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7))).isTrue();
    }

    @Test
    void flipEquivExample2() {
        assertThat(task.flipEquiv(constructTreeNode(), constructTreeNode())).isTrue();
    }

    @Test
    void flipEquivExample3() {
        assertThat(task.flipEquiv(constructTreeNode(), constructTreeNode(1))).isFalse();
    }
}