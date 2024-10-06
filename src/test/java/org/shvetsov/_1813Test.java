package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1813Test {

    private static _1813 task;

    @BeforeEach
    public void setup() {
        task = new _1813();
    }

    @Test
    void areSentencesSimilarExample1() {
        assertThat(task.areSentencesSimilar("My name is Haley", "My Haley")).isTrue();
    }
    @Test
    void areSentencesSimilarExample2() {
        assertThat(task.areSentencesSimilar("of", "A lot of words")).isFalse();
    }
    @Test
    void areSentencesSimilarExample3() {
        assertThat(task.areSentencesSimilar("Eating right now", "Eating")).isTrue();
    }

    @Test
    void areSentencesSimilarTC85() {
        assertThat(task.areSentencesSimilar("c h p Ny", "c BDQ r h p Ny")).isTrue();
    }
}