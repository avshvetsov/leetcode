package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1381,
        name = "Design a Stack With Increment Operation",
        level = Level.MEDIUM,
        tags = {"Array", "Stack", "Design"}
)
public class _1381 {

    static class CustomStack {

        List<Integer> stack;
        int maxSize;

        public CustomStack(int maxSize) {
            this.stack = new LinkedList<>();
            this.maxSize = maxSize;
        }

        public void push(int x) {
            if (stack.size() < maxSize) {
                stack.addLast(x);
            }
        }

        public int pop() {
            if (stack.isEmpty()) return -1;
            else return stack.removeLast();
        }

        public void increment(int k, int val) {
            ListIterator<Integer> iterator = stack.listIterator();
            while (iterator.hasNext() && k > 0) {
                int curr = iterator.next();
                iterator.set(curr + val);
                k--;
            }
        }
    }

}