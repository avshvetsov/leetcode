package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1552Test {

    private static _1552 task;

    @BeforeEach
    public void setup() {
        task = new _1552();
    }

    @Test
    void maxDistanceExample1() {
        assertThat(task.maxDistance(new int[]{1, 2, 3, 4, 7}, 3)).isEqualTo(3);
    }

    @Test
    void maxDistanceExample2() {
        assertThat(task.maxDistance(new int[]{5, 4, 3, 2, 1, 1000000000}, 2)).isEqualTo(999999999);
    }

    @Test
    void maxDistanceTC30() {
        assertThat(task.maxDistance(new int[]{79, 74, 57, 22}, 4)).isEqualTo(5);
    }
}