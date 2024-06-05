package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _1002Test {

    private static _1002 task;

    @BeforeEach
    public void setup() {
        task = new _1002();
    }

    @Test
    void commonCharsExample1() {
        assertThat(task.commonChars(new String[]{"bella", "label", "roller"})).containsExactlyInAnyOrderElementsOf(List.of("e", "l", "l"));
    }
    @Test
    void commonCharsExample2() {
        assertThat(task.commonChars(new String[]{"cool","lock","cook"})).containsExactlyInAnyOrderElementsOf(List.of("c","o"));
    }

}