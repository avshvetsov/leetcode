package org.shvetsov.core;

public @interface LeetCode {
    int number();

    String name();

    Level level();

    String[] tags();

    String[] todo() default {};

    int resultTime() default -1;

    double beatsTime() default -1;

    double resultSpace() default -1;

    double beatsSpace() default -1;

}
