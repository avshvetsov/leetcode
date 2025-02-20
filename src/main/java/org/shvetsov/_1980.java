package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 1980,
        name = "Find Unique Binary String",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Backtracking"}
)
public class _1980 {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> ints = new HashSet<>();
        for (String num : nums) {
            ints.add(Integer.parseInt(num, 2));
        }
        for (int i = 0; i < 17; i++) {
            if (!ints.contains(i)) {
                String res = "0000000000000000" + Integer.toBinaryString(i);
                return res.substring(res.length() - nums.length);
            }
        }
        throw new IllegalArgumentException();
    }

    static class CantorsDiagonalArgument {
        public String findDifferentBinaryString(String[] nums) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                sb.append(nums[i].charAt(i) == '1' ? '0' : '1');
            }
            return sb.toString();
        }
    }
}