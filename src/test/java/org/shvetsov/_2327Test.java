package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2327Test {

    private _2327 task;

    @BeforeEach
    public void setup() {
        this.task = new _2327();
    }

    @Test
    void peopleAwareOfSecretExample1() {
        assertThat(task.peopleAwareOfSecret(6, 2, 4)).isEqualTo(5);
    }

    @Test
    void peopleAwareOfSecretExample2() {
        assertThat(task.peopleAwareOfSecret(4, 1, 3)).isEqualTo(6);
    }

    @Test
    void peopleAwareOfSecretTC54() {
        assertThat(task.peopleAwareOfSecret(684, 18, 496)).isEqualTo(653668527);
    }
}