package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _752Test {

    private static _752 task;

    @BeforeEach
    public void setup() {
        task = new _752();
    }

    @Test
    void openLock() {
        assertThat(task.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202")).isEqualTo(6);
        assertThat(task.openLock(new String[]{"8888"}, "0009")).isEqualTo(1);
        assertThat(task.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888")).isEqualTo(-1);
    }
}