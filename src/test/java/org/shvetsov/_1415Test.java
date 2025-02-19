package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1415Test {

    private static _1415 task;

    @BeforeEach
    public void setup() {
        task = new _1415();
    }

    @Test
    void getHappyStringExample1() {
        assertThat(task.getHappyString(1, 3)).isEqualTo("c");
    }

    @Test
    void getHappyStringExample2() {
        assertThat(task.getHappyString(1, 4)).isEqualTo("");
    }

    @Test
    void getHappyStringExample3() {
        assertThat(task.getHappyString(3, 9)).isEqualTo("cab");
    }

}