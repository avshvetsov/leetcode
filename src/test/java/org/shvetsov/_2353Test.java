package org.shvetsov;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2353Test {

    @Test
    void FoodRatingsExample1() {
        _2353.FoodRatings foodRatings = new _2353.FoodRatings(new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 12, 8, 15, 14, 7});

        assertThat(foodRatings.highestRated("korean")).isEqualTo("kimchi");
        assertThat(foodRatings.highestRated("japanese")).isEqualTo("ramen");
        foodRatings.changeRating("sushi", 16);
        assertThat(foodRatings.highestRated("japanese")).isEqualTo("sushi");
        foodRatings.changeRating("ramen", 16);
        assertThat(foodRatings.highestRated("japanese")).isEqualTo("ramen");
    }

    @Test
    void FoodRatingsTC37() {
        _2353.FoodRatings foodRatings = new _2353.FoodRatings(new String[]{"emgqdbo", "jmvfxjohq", "qnvseohnoe", "yhptazyko", "ocqmvmwjq"},
                new String[]{"snaxol", "snaxol", "snaxol", "fajbervsj", "fajbervsj"},
                new int[]{2, 6, 18, 6, 5});

        foodRatings.changeRating("qnvseohnoe", 11);
        assertThat(foodRatings.highestRated("fajbervsj")).isEqualTo("yhptazyko");
        foodRatings.changeRating("emgqdbo", 3);
        foodRatings.changeRating("jmvfxjohq", 9);
        foodRatings.changeRating("emgqdbo", 14);
        assertThat(foodRatings.highestRated("fajbervsj")).isEqualTo("yhptazyko");
        assertThat(foodRatings.highestRated("snaxol")).isEqualTo("emgqdbo");
    }

    @Test
    void FoodRatingsTC38() {
        _2353.FoodRatings foodRatings = new _2353.FoodRatings(new String[]{"czopaaeyl","lxoozsbh","kbaxapl"},
                new String[]{"dmnuqeatj","dmnuqeatj","dmnuqeatj"},
                new int[]{11,2,15});

        foodRatings.changeRating("czopaaeyl", 12);
        assertThat(foodRatings.highestRated("dmnuqeatj")).isEqualTo("kbaxapl");
        foodRatings.changeRating("kbaxapl", 8);
        foodRatings.changeRating("lxoozsbh", 5);
        assertThat(foodRatings.highestRated("dmnuqeatj")).isEqualTo("czopaaeyl");
    }
}