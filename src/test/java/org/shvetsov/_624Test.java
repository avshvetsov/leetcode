package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _624Test {

    private static _624 task;

    @BeforeEach
    public void setup() {
        task = new _624();
    }

    @Test
    void maxDistanceExample1() {
        assertThat(task.maxDistance(List.of(List.of(1, 2, 3), List.of(4, 5), List.of(1, 2, 3)))).isEqualTo(4);
    }
    @Test
    void maxDistanceExample2() {
        assertThat(task.maxDistance(List.of(List.of(1), List.of(1)))).isEqualTo(0);
    }

    @Test
    void maxDistanceTC89() {
        assertThat(task.maxDistance(List.of(List.of(-8,-7,-7,-5,1,1,3,4), List.of(-2), List.of(-10,-10,-7,0,1,3), List.of(2))))
                .isEqualTo(14);
    }
}