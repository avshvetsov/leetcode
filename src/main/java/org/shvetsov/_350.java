package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@LeetCode(
        number = 350,
        name = "Intersection of Two Arrays II",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "Two Pointers", "Binary Search", "Sorting"}
)
public class _350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] cnt1 = new int[1001];
        int[] cnt2 = new int[1001];
        for (int i : nums1) {
            cnt1[i]++;
        }
        for (int i : nums2) {
            cnt2[i]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < cnt1.length; i++) {
            int cnt = Math.min(cnt1[i], cnt2[i]);
            while (cnt > 0) {
                res.add(i);
                cnt--;
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static class WithSortedList {
        public int[] intersect(int[] nums1, int[] nums2) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            int i = 0, j = 0, k = 0;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            while (i < l1 && j < l2) {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    nums1[k] = nums1[i];
                    i++;
                    j++;
                    k++;
                }
            }
            return Arrays.copyOfRange(nums1, 0, k);
        }
    }
}