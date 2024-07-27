package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2976Test {

    private static _2976 task;

    @BeforeEach
    public void setup() {
        task = new _2976();
    }

    @Test
    void minimumCostExample1() {
        assertThat(task.minimumCost("abcd", "acbe", new char[]{'a', 'b', 'c', 'c', 'e', 'd'},
                new char[]{'b', 'c', 'b', 'e', 'b', 'e'}, new int[]{2, 5, 5, 1, 2, 20})).isEqualTo(28);
    }
    @Test
    void minimumCostExample2() {
        assertThat(task.minimumCost("aaaa", "bbbb", new char[]{'a','c'},
                new char[]{'c','b'}, new int[]{1,2})).isEqualTo(12);
    }
    @Test
    void minimumCostExample3() {
        assertThat(task.minimumCost("abcd", "abce", new char[]{'a'},
                new char[]{'e'}, new int[]{10000})).isEqualTo(-1);
    }
}