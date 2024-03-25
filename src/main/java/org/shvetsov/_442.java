package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 442,
        name = "Find All Duplicates in an Array",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table"}
)
public class _442 {

    //1 <= nums[i] <= n
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int pos = Math.abs(nums[i]);
            if (nums[pos - 1] < 0) {
                res.add(pos);
            }
            nums[pos - 1] *= -1;
        }
        return res;
    }

    public List<Integer> findDuplicates2(int[] nums) {
        Set<Integer> cache = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (!cache.add(num)) {
                res.add(num);
            }
        }
        return res;
    }
}