package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1331Test {

    private static _1331 task;

    @BeforeEach
    public void setup() {
        task = new _1331();
    }

    @Test
    void arrayRankTransformExample1() {
        assertThat(task.arrayRankTransform(new int[]{40, 10, 20, 30})).containsExactly(4, 1, 2, 3);
    }

    @Test
    void arrayRankTransformExample2() {
        assertThat(task.arrayRankTransform(new int[]{100, 100, 100})).containsExactly(1, 1, 1);
    }

    @Test
    void arrayRankTransformExample3() {
        assertThat(task.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12})).containsExactly(5, 3, 4, 2, 8, 6, 7, 1, 3);
    }
}