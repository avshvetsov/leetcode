package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _729Test {

    private _729.MyCalendar calendar;

    @BeforeEach
    public void setup() {
        this.calendar = new _729.MyCalendar();
    }

    @Test
    void bookMyCalendarExample1() {
        assertThat(calendar.book(10, 20)).isTrue();
        assertThat(calendar.book(15, 25)).isFalse();
        assertThat(calendar.book(20, 30)).isTrue();
    }
}