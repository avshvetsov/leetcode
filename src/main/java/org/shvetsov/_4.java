package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 4,
        name = "Median of Two Sorted Arrays",
        level = Level.HARD,
        tags = {"Array", "Binary Search", "Divide and Conquer"}
)
public class _4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        int i = 0;
        int j1 = 0;
        int j2 = 0;
        while (j1 < nums1.length && j2 < nums2.length) {
            if (nums1[j1] < nums2[j2]) {
                array[i] = nums1[j1];
                j1++;
            } else {
                array[i] = nums2[j2];
                j2++;
            }
            i++;
        }
        while (j1 < nums1.length) {
            array[i] = nums1[j1];
            j1++;
            i++;
        }
        while (j2 < nums2.length) {
            array[i] = nums2[j2];
            j2++;
            i++;
        }
        return array.length % 2 != 0 ?
                array[array.length / 2] :
                ((double) array[array.length / 2] + (double) array[(array.length / 2) - 1]) / 2;
    }
}