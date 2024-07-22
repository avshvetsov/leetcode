package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2418Test {

    private static _2418 task;

    @BeforeEach
    public void setup() {
        task = new _2418();
    }

    @Test
    void sortPeopleExample1() {
        assertThat(task.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}))
                .isEqualTo(new String[]{"Mary", "Emma", "John"});
    }

    @Test
    void sortPeopleExample2() {
        assertThat(task.sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150}))
                .isEqualTo(new String[]{"Bob", "Alice", "Bob"});
    }
}