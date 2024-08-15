package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _860Test {

    private static _860 task;

    @BeforeEach
    public void setup() {
        task = new _860();
    }

    @Test
    void lemonadeChangeExample1() {
        assertThat(task.lemonadeChange(new int[]{5, 5, 5, 10, 20})).isTrue();
    }

    @Test
    void lemonadeChangeExample2() {
        assertThat(task.lemonadeChange(new int[]{5,5,10,10,20})).isFalse();
    }
}