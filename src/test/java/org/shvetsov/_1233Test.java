package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1233Test {

    private static _1233 task;

    @BeforeEach
    public void setup() {
        task = new _1233();
    }

    @Test
    void removeSubfoldersExample1() {
        assertThat(task.removeSubfolders(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"})).containsExactlyInAnyOrder("/a", "/c/d", "/c/f");
    }

    @Test
    void removeSubfoldersExample2() {
        assertThat(task.removeSubfolders(new String[]{"/a", "/a/b/c", "/a/b/d"})).containsExactlyInAnyOrder("/a");
    }

    @Test
    void removeSubfoldersExample3() {
        assertThat(task.removeSubfolders(new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"})).containsExactlyInAnyOrder("/a/b/c", "/a/b/ca", "/a/b/d");
    }
}