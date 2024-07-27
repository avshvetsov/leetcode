package org.shvetsov.core;

public @interface LeetCode {
    int number();

    String name();

    Level level();

    String[] tags();

    String[] todo() default {};



}
