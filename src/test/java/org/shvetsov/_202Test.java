package org.shvetsov;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _202Test {

    private static _202 task;

    @BeforeEach
    public void setup() {
        task = new _202();
    }

    @Test
    void isHappy() {
        assertThat(task.isHappy(19)).isTrue();
        assertThat(task.isHappy(2)).isFalse();
        assertThat(task.isHappy(7)).isTrue();
    }


}