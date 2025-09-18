package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2353,
        name = "Design a Food Rating System",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Design", "Heap (Priority Queue)", "Ordered Set", "Weekly Contest 303", "TLE"}
)
public class _2353 {

    static class FoodRatings {

        private final Map<String, Food> foodMap = new HashMap<>();
        private final Map<String, TreeSet<Food>> cuisineFoods = new HashMap<>();

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            for (int i = 0; i < foods.length; i++) {
                String cuisine = cuisines[i];
                int rating = ratings[i];
                Food food = new Food(foods[i], cuisine, rating);
                this.foodMap.put(foods[i], food);
                this.cuisineFoods.computeIfAbsent(cuisine, k -> new TreeSet<>()).add(food);
            }
        }

        record Food(String food, String cuisine, int rating) implements Comparable<Food> {
            public Food withRating(int newRating) {
                return new Food(food, cuisine, newRating);
            }

            @Override
            public int compareTo(Food f) {
                if (f.rating != this.rating) {
                    return Integer.compare(this.rating, f.rating);
                } else {
                    return f.food.compareTo(this.food);
                }
            }
        }

        public void changeRating(String food, int newRating) {
            Food oldFood = this.foodMap.get(food);
            if (oldFood != null) {
                Food newFood = oldFood.withRating(newRating);
                this.foodMap.put(food, newFood);
                //Усі порівняння в TreeSet відбуваються через Comparator і не використовують equals.
                //Тому Comparator та equals мають бути узгодженими
                //А це означає, що не можна просто викликати .add(newFood), у надії, що він зареплейсить oldFood. Тому що умова еквівалентності береться за Comparator.
                this.cuisineFoods.get(newFood.cuisine).remove(oldFood);
                this.cuisineFoods.get(newFood.cuisine).add(newFood);
            }
        }

        public String highestRated(String cuisine) {
            return this.cuisineFoods.get(cuisine).getLast().food;
        }
    }

}