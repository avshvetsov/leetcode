package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _78Test {

    private static _78 task;

    @BeforeEach
    public void setup() {
        task = new _78();
    }

    @Test
    void subsetsExample1() {
        List<List<Integer>> expected = new ArrayList<>() {{
            add(List.of());
            add(List.of(1));
            add(List.of(1, 2));
            add(List.of(1, 3));
            add(List.of(2));
            add(List.of(2, 3));
            add(List.of(1, 2, 3));
            add(List.of(3));
        }};
        assertThat(task.subsets(new int[]{1, 2, 3})).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void subsetsExample2() {
        List<List<Integer>> expected = new ArrayList<>() {{
            add(List.of());
            add(List.of(0));
        }};
        assertThat(task.subsets(new int[]{0})).containsExactlyInAnyOrderElementsOf(expected);
    }
}