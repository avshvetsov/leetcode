package org.shvetsov;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1381Test {

    @Test
    void customStackExample1() {
        _1381.CustomStack stack = new _1381.CustomStack(3);
        stack.push(1);
        stack.push(2);
        assertThat(stack.pop()).isEqualTo(2);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.increment(5,100);
        stack.increment(2,100);
        assertThat(stack.pop()).isEqualTo(103);
        assertThat(stack.pop()).isEqualTo(202);
        assertThat(stack.pop()).isEqualTo(201);
        assertThat(stack.pop()).isEqualTo(-1);
    }

}