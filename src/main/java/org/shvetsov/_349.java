package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@LeetCode(
        number = 349,
        name = "Intersection of Two Arrays",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "Two Pointers", "Binary Search", "Sorting"}
)
public class _349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int f = 0;
        int s = 0;

        Set<Integer> res = new HashSet<>();

        while (f < nums1.length && s < nums2.length) {
            if (nums1[f] == nums2[s]) {
                res.add(nums1[f]);
                f++;
                s++;
            } else if (nums1[f] < nums2[s]) f++;
            else s++;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }


    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return list1.stream().distinct().filter(list2::contains).mapToInt(Integer::intValue).toArray();
    }

}