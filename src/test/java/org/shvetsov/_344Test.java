package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _344Test {

    private static _344 task;

    @BeforeEach
    public void setup() {
        task = new _344();
    }

    @Test
    void reverseStringExample1() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        task.reverseString(input);
        assertThat(input).isEqualTo(new char[]{'o','l','l','e','h'});
    }

    @Test
    void reverseStringExample2() {
        char[] input = {'H','a','n','n','a','h'};
        task.reverseString(input);
        assertThat(input).isEqualTo(new char[]{'h','a','n','n','a','H'});
    }
}