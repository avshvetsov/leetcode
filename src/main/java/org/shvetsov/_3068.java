package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3068,
        name = "Find the Maximum Sum of Node Values",
        level = Level.HARD,
        tags = {"Array", "Dynamic Programming", "Greedy", "Bit Manipulation", "Tree", "Sorting"}
)
public class _3068 {

    //Statement 0: подвійний XOR залишає результат незмінним.
    //Ми просто 2чі перемкнемо біти які в k мають значення 1.
    //3 XOR 1 = 2 XOR 1 = 3
    //Statement 1: будь-які 2 ноди дерева можна зв'язати в ланцюжок, де перший і останній елемент - ці 2 ноди
    //Statement 2: якщо в нас є будь-які 2 ноди дерева, XOR яких дасть сумарно позитивний результат, то ми завжди можемо ввиконати їх XOR не змінивши значення інших нод.
    //Як висновок Statement 1, ми можемо отримати ланцюжки з чьотними (even) або нечьотними (odd) довжинами:
    //- even length: a -> b -> c -> d (хочемо змінити a і d)
    //  a & b; c & d; b & c;
    //  b та c залишилися незмінними згідно Statement 0.
    //- odd length: a -> b -> c -> d -> e (хочемо змінити a і e)
    //  a & b; d & e; b & c; c & d;
    //  b, c та d залишилися незмінними згідно Statement 0.
    //Statement 3: щоб знайти максимальний результат, після будь-якої кількості XOR, нам треба:
    //- знайти к-ть XOR які мають позитивний вплив:
    //- якщо к-ть XOR - even -> просто додати суму позитивного впливу до початкової
    //- якщо к-ть XOR - odd -> додати суму позитивного впливу усіх окрім найменшої, та перевірити дельту між найменшою позитивною та найменшою негативною по модулю;
    //      - якщо дельта позитивна - додати
    //      - якщо дельта негативна - не робити нічого
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long defaultSum = 0;
        long positiveSum = 0;
        int positiveCount = 0;
        long minPositive = Long.MAX_VALUE;
        long minNegative = Long.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            defaultSum += num;
            int xor = num ^ k;
            if (xor > num) {
                positiveSum += xor - num;
                positiveCount++;
                minPositive = Math.min(minPositive, xor - num);
            } else {
                minNegative = Math.min(minNegative, num - xor);
            }
        }

        if (positiveCount % 2 == 0) {
            return defaultSum + positiveSum;
        } else {
            return defaultSum + positiveSum - minPositive + Math.max(minPositive - minNegative, 0);
        }
    }
}