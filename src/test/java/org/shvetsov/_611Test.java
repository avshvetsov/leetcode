package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _611Test {

    private _611 task;

    @BeforeEach
    public void setup() {
        task = new _611();
    }

    @Test
    void triangleNumberExample1() {
        assertThat(task.triangleNumber(new int[]{2, 2, 3, 4})).isEqualTo(3);
    }

    @Test
    void triangleNumberExample2() {
        assertThat(task.triangleNumber(new int[]{4, 2, 3, 4})).isEqualTo(4);
    }
}