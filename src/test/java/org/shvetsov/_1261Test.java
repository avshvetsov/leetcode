package org.shvetsov;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.constructTreeNode;

class _1261Test {

    private _1261.FindElements task;

    @Test
    void findElementsExample1() {
        this.task = new _1261.FindElements(constructTreeNode(-1, null, -1));
        assertThat(task.find(1)).isFalse();
        assertThat(task.find(2)).isTrue();
    }

    @Test
    void findElementsExample2() {
        this.task = new _1261.FindElements(constructTreeNode(-1, -1, -1, -1, -1));
        assertThat(task.find(1)).isTrue();
        assertThat(task.find(3)).isTrue();
        assertThat(task.find(5)).isFalse();
    }

    @Test
    void findElementsExample3() {
        this.task = new _1261.FindElements(constructTreeNode(-1, null, -1, -1, null, -1));
        assertThat(task.find(2)).isTrue();
        assertThat(task.find(3)).isFalse();
        assertThat(task.find(4)).isFalse();
        assertThat(task.find(5)).isTrue();
    }

}