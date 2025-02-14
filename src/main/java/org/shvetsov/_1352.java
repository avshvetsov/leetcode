package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1352,
        name = "Product of the Last K Numbers",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Design", "Data Stream", "Prefix Sum"}
)
public class _1352 {

    static class ProductOfNumbers {

        List<Integer> prefixProduct;
        int index;

        public ProductOfNumbers() {
            initPrefixProduct();
        }

        private void initPrefixProduct() {
            prefixProduct = new ArrayList<>();
            prefixProduct.add(1);
            index = 0;
        }

        public void add(int num) {
            if (num == 0) {
                initPrefixProduct();
            } else {
                index++;
                prefixProduct.add(prefixProduct.get(index - 1) * num);
            }
        }

        public int getProduct(int k) {
            if (index >= k) {
                return prefixProduct.get(index) / prefixProduct.get(index - k);
            } else {
                return 0;
            }
        }
    }


    static class ProductOfNumbersArray {

        int[] prefixProduct;
        int index;

        public ProductOfNumbersArray() {
            initPrefixProduct();
        }

        private void initPrefixProduct() {
            prefixProduct = new int[40001];
            prefixProduct[0] = 1;
            index = 0;
        }

        public void add(int num) {
            if (num == 0) {
                initPrefixProduct();
            } else {
                index++;
                prefixProduct[index] = prefixProduct[index - 1] * num;
            }
        }

        public int getProduct(int k) {
            if (index >= k) {
                return prefixProduct[index] / prefixProduct[index - k];
            } else {
                return 0;
            }
        }
    }

}