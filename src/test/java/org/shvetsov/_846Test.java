package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _846Test {

    private static _846 task;

    @BeforeEach
    public void setup() {
        task = new _846();
    }

    @Test
    void isNStraightHandExample1() {
        assertThat(task.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3)).isTrue();
    }

    @Test
    void isNStraightHandExample2() {
        assertThat(task.isNStraightHand(new int[]{1,2,3,4,5}, 4)).isFalse();
    }
}