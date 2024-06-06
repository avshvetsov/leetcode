package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _846Test {

    private static _846 task;
    private static _846.NotEfficient taskNotEfficient;

    @BeforeEach
    public void setup() {
        task = new _846();
        taskNotEfficient = new _846.NotEfficient();
    }

    @Test
    void isNStraightHandExample1() {
        assertThat(task.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3)).isTrue();
    }

    @Test
    void isNStraightHandExample2() {
        assertThat(task.isNStraightHand(new int[]{1,2,3,4,5}, 4)).isFalse();
    }
    @Test
    void isNStraightHandNotEfficientExample1() {
        assertThat(taskNotEfficient.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3)).isTrue();
    }

    @Test
    void isNStraightHandNotEfficientExample2() {
        assertThat(taskNotEfficient.isNStraightHand(new int[]{1,2,3,4,5}, 4)).isFalse();
    }
}