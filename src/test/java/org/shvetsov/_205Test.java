package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _205Test {

    private static _205 task;

    @BeforeEach
    public void setup() {
        task = new _205();
    }
    @Test
    void isIsomorphic() {
        assertThat(task.isIsomorphic("egg", "add")).isTrue();
        assertThat(task.isIsomorphic("foo", "bar")).isFalse();
        assertThat(task.isIsomorphic("paper", "title")).isTrue();
    }
}