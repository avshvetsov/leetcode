package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _889Test {

    private _889 task;

    @BeforeEach
    public void setup() {
        task = new _889();
    }

    @Test
    void constructFromPrePostExample1() {
        assertThat(task.constructFromPrePost(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 5, 2, 6, 7, 3, 1})).isEqualTo(TreeUtils.constructTreeNode(1, 2, 3, 4, 5, 6, 7));
    }

    @Test
    void constructFromPrePostExample2() {
        assertThat(task.constructFromPrePost(new int[]{1}, new int[]{1})).isEqualTo(TreeUtils.constructTreeNode(1));
    }

}