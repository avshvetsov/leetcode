package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 260,
        name = "Single Number III",
        level = Level.MEDIUM,
        tags = {"Array", "Bit Manipulation"}
)
public class _260 {

    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int lastBit = 0;
        for (int i = 0; i < 32; i++) {
            if ((xor & (1 << i)) != 0) {
                lastBit = xor & (1 << i);
                break;
            }
        }
//        alternative
//        int lastBit = xor & -xor;

        for (int num : nums) {
            if ((lastBit & num) == 0) {
                result[0] ^= num;
            } else result[1] ^= num;
        }
        return result;
    }

    public static class notConstantSpace {
        public int[] singleNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    set.remove(num);
                } else set.add(num);
            }
            return set.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}