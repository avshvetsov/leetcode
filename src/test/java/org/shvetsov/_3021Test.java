package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3021Test {

    private _3021 task;

    @BeforeEach
    public void setup() {
        this.task = new _3021();
    }

    @Test
    void flowerGameExample1() {
        assertThat(this.task.flowerGame(3,2)).isEqualTo(3);
    }

    @Test
    void flowerGameExample2() {
        assertThat(this.task.flowerGame(1,1)).isEqualTo(0);
    }
}