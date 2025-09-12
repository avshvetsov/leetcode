package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3227Test {

    private _3227 task;

    @BeforeEach
    public void setup() {
        this.task = new _3227();
    }

    @Test
    void doesAliceWinExample1() {
        assertThat(task.doesAliceWin("leetcoder")).isTrue();
    }

    @Test
    void doesAliceWinExample2() {
        assertThat(task.doesAliceWin("bbcd")).isFalse();
    }
}