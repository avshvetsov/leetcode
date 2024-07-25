package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 912,
        name = "Sort an Array",
        level = Level.MEDIUM,
        tags = {"Array", "Divide and Conquer", "Sorting", "Heap (Priority Queue)", "Merge Sort", "Bucket Sort", "Radix Sort", "Counting Sort"}
)
public class _912 {

    public int[] sortArray(int[] nums) {
        int[] freq = new int[2 * 50000 + 1];
        for (int num : nums) {
            freq[num + 50000]++;
        }
        int i = 0;
        for (int j = 0; j < freq.length; j++) {
            while (freq[j] > 0) {
                nums[i] = j - 50000;
                i++;
                freq[j]--;
            }
        }
        return nums;
    }


    public static class QuickSort {
        public int[] sortArray(int[] nums) {
            quickSort(nums, 0, nums.length - 1);
            return nums;
        }

        private void quickSort(int[] nums, int s, int e) {
            if (e > s) {
                int pivot = partition(nums, s, e);

                quickSort(nums, s, pivot - 1);
                quickSort(nums, pivot + 1, e);
            }
        }

        private int partition(int[] nums, int s, int e) {
            int pivot = nums[e];
            int i = s - 1;
            for (int j = s; j < e; j++) {
                if (nums[j] < pivot) {
                    i++;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            i++;
            int temp = nums[i];
            nums[i] = nums[e];
            nums[e] = temp;
            return i;
        }
    }

}