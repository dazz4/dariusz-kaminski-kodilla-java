package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final int burgers;
    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    public Bigmac(int burgers, String bun, String sauce, List<String> ingredients) {
        this.burgers = burgers;
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        private int burgers;
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(burgers, bun, sauce, ingredients);
        }
    }
}
