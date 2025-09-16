package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.List;
import java.util.Stack;

@LeetCode(
        number = 2197,
        name = "Replace Non-Coprime Numbers in Array",
        level = Level.HARD,
        tags = {"Array", "Math", "Stack", "Number Theory", "Weekly Contest 283"}
)
public class _2197 {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty()) {
                int gcd = gcd(stack.peek(), num);
                if (gcd == 1) {
                    break;
                }
                Integer prev = stack.pop();
                num = lcm(prev, num, gcd);
            }
            stack.push(num);
        }
        return stack.stream().toList();
    }

    // GCD LCM Formula: a x b = LCM(a, b) * GCD(a, b)
    private int lcm(int a, int b, int gcd) {
        return (a / gcd) * b;
    }

    private int lcmBruteforce(int a, int b) {
        int g = Math.max(a, b);
        int s = Math.min(a, b);
        int lcm = g;
        while (lcm % s != 0) {
            lcm += g;
        }
        return lcm;
    }

    //Euclidean Algorithm for GCD
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private int gcdNoRecursion(int a, int b) {
        int g = Math.max(a, b);
        int s = Math.min(a, b);
        while (s > 0) {
            int r = g % s;
            g = s;
            s = r;
        }
        return g;
    }
}