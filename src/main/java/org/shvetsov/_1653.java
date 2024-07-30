package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Stack;

@LeetCode(
        number = 1653,
        name = "Minimum Deletions to Make String Balanced",
        level = Level.MEDIUM,
        tags = {"String", "Dynamic Programming", "Stack"}
)
public class _1653 {
    public int minimumDeletions(String s) {
        int res = Integer.MAX_VALUE;
        char[] chars = s.toCharArray();
        int[] dpl = new int[s.length()];
        int[] dpr = new int[s.length()];
        int l = 0, r = 0;
        for (int i = 0, j = s.length() - 1; i <= s.length() && j >= 0; i++, j--) {
            if (chars[i] == 'b') {
                l++;
            }
            if (chars[j] == 'a') {
                r++;
            }
            dpl[i] = l;
            dpr[j] = r;
        }
        for (int i = 0; i < dpl.length; i++) {
            res = Math.min(res, dpl[i] + dpr[i]);
        }
        return res-1;
    }

    public static class WithStack {
        public int minimumDeletions(String s) {
            int res = 0;
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!stack.isEmpty() && stack.peek() == 'b' && chars[i] == 'a') {
                    stack.pop();
                    res++;
                } else stack.push(chars[i]);
            }
            return res;
        }
    }
}