package com.kodilla.patterns.builder.bigmac;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final int burgers;
    private final Sauce sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private Sauce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredients(String... ingredients) {
            this.ingredients.addAll(Arrays.asList(ingredients));
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(final String bun, int burgers, final Sauce sauce, List<String> ingredients ) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return this.bun;
    }

    public int getBurgers() {
        return this.burgers;
    }

    public Sauce getSauce() {
        return this.sauce;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }
}
