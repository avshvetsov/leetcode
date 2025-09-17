package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@LeetCode(
        number = 2353,
        name = "Design a Food Rating System",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Design", "Heap (Priority Queue)", "Ordered Set", "Weekly Contest 303", "TLE"}
)
public class _2353 {

    static class FoodRatings {

        private Map<String, Food> foodMap = new HashMap<>();
        private Map<String, Food> cuisineHighestRatedFood = new HashMap<>();

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            for (int i = 0; i < foods.length; i++) {
                String cuisine = cuisines[i];
                int rating = ratings[i];
                Food food = new Food(foods[i], cuisine, rating);
                this.foodMap.put(foods[i], food);
                this.cuisineHighestRatedFood.compute(cuisine, (k, v) -> v == null || food.compareTo(v) > 0 ? food : v);
            }
        }

        record Food(String food, String cuisine, int rating) implements Comparable<Food> {
            public Food withRating(int newRating) {
                return new Food(food, cuisine, newRating);
            }

            @Override
            public int compareTo(Food f) {
                if (f.rating != this.rating) {
                    return this.rating - f.rating;
                } else {
                    return f.food.compareTo(this.food);
                }
            }
        }

        public void changeRating(String food, int newRating) {
            Food foodR = this.foodMap.get(food);
            if (foodR != null) {
                Food newFood = foodR.withRating(newRating);
                this.foodMap.put(food, newFood);
                if (!this.cuisineHighestRatedFood.get(newFood.cuisine).food.equals(food)) {
                    this.cuisineHighestRatedFood.compute(foodR.cuisine, (k, v) -> v == null || newFood.compareTo(v) > 0 ? newFood : v);
                } else {
                    List<Food> foodList = foodMap.values().stream()
                            .filter(f -> f.cuisine.equals(newFood.cuisine))
                            .sorted((o1, o2) -> o1.rating != o2.rating ? Integer.compare(o1.rating, o2.rating) : o2.food.compareTo(o1.food))
                            .toList();
                    this.cuisineHighestRatedFood.put(newFood.cuisine, foodList.getLast());
                }
            }
        }

        public String highestRated(String cuisine) {
            return this.cuisineHighestRatedFood.get(cuisine).food;
        }
    }

}