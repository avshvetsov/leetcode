package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1497Test {

    private static _1497 task;

    @BeforeEach
    public void setup() {
        task = new _1497();
    }

    @Test
    void canArrangeExample1() {
        assertThat(task.canArrange(new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5)).isTrue();
    }

    @Test
    void canArrangeExample2() {
        assertThat(task.canArrange(new int[]{1, 2, 3, 4, 5, 6}, 7)).isTrue();
    }

    @Test
    void canArrangeExample3() {
        assertThat(task.canArrange(new int[]{1, 2, 3, 4, 5, 6}, 10)).isFalse();
    }

    @Test
    void canArrangeTC4() {
        assertThat(task.canArrange(new int[]{-1,1,-2,2,-3,3,-4,4}, 3)).isTrue();
    }


}