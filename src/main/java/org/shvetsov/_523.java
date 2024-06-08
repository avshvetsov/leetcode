package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@LeetCode(
        number = 523,
        name = "Continuous Subarray Sum",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Math", "Prefix Sum"}
)
public class _523 {

    /**
     * <p>Принцип Prefix Sum заключается в том, что мы считаем суммы чисел с первого элемента.<p/>
     * <p>Потом проверяем мы проходимся по суммам и проверяем на заданное условие. Результат проверки сохраняем в Map.<p/>
     * <p>Если результаты двух проверок одинаковы (значение уже существует в Map), значит сумма чисел от значения, которое в Map, до текущего и дает нам искомый результат.<p/>
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        final int delta = 2;
        //создаем массив prefixSum
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            //наше условие - это остаток от деления на k
            int leftOfDivide = prefixSum[i + 1] % k;
            //если map уже содержит наше условие, то нам ничего с map делать не нужно
            if (map.containsKey(leftOfDivide)) {
                //если map содержит наше условие, но значение, которое размещено в map отличется от i меньше чем на delta,
                //значит это не удовлетворяет нашему условию, потому что размер массива будет меньше delta. Не делаем ничего.
                if (i - map.get(leftOfDivide) >= delta) {
                    return true;
                }
            //если наше условие выполняется с первого элемента, то возвращаем true
            //можно заменить путем добавления в map начального значения (0,-1)
//            } else if (leftOfDivide == 0 && i > 0) {
//                return true;
            //иначе, добавляем значение в map
            } else {
                if (leftOfDivide != 0) {
                    map.put(leftOfDivide, i);
                }
            }
        }
        return false;
    }

    public static class TimeLimitExceeded {
        public boolean checkSubarraySum(int[] nums, int k) {
            if (nums.length < 2) {
                return false;
            }
            int[] preSum = new int[nums.length];
            preSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                preSum[i] = preSum[i - 1] + nums[i];
                if (preSum[i] % k == 0) {
                    return true;
                }
                int j = i - 2;
                while (j >= 0) {
                    if ((preSum[i] - preSum[j]) % k == 0) {
                        return true;
                    }
                    j--;
                }
            }
            return false;
        }
    }
}