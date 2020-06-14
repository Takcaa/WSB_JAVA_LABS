package com.company;

import java.io.File;

public class Animal {
    final String species;
    private Double weight;
    String name;
    File pic;

    static final Double DEFAULT_WEIGHT = 10.0;

    public Animal(String species) {
        this.species = species;
        if (species == "Owczarek") {
            this.weight = DEFAULT_WEIGHT + 3;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
    }
}
