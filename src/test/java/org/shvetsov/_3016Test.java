package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3016Test {

    private static _3016 task;

    @BeforeEach
    public void setup() {
        task = new _3016();
    }

    @Test
    void minimumPushesExample1() {
        assertThat(task.minimumPushes("abcde")).isEqualTo(5);
    }

    @Test
    void minimumPushesExample2() {
        assertThat(task.minimumPushes("xyzxyzxyzxyz")).isEqualTo(12);
    }

    @Test
    void minimumPushesExample3() {
        assertThat(task.minimumPushes("aabbccddeeffgghhiiiiii")).isEqualTo(24);
    }
}