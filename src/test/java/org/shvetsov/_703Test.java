package org.shvetsov;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _703Test {

    @Test
    void testExample1() {
        _703.KthLargest kthLargest = new _703.KthLargest(3, new int[]{4, 5, 8, 2});
        assertThat(kthLargest.add(3)).isEqualTo(4);
        assertThat(kthLargest.add(5)).isEqualTo(5);
        assertThat(kthLargest.add(10)).isEqualTo(5);
        assertThat(kthLargest.add(9)).isEqualTo(8);
        assertThat(kthLargest.add(4)).isEqualTo(8);
    }
}