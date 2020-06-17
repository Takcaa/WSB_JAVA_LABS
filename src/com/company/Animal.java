package com.company;

import java.io.File;

public class Animal {
    final String species;
    private Double weight;
    public String name;
    public File pic;

    static final Double DEFAULT_WEIGHT = 10.0;

    public Animal(String species) {
        this.species = species;
        if (species == "Owczarek") {
            this.weight = DEFAULT_WEIGHT + 3;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
    }

    public void feed() {
        if (this.weight > 0) {
            this.weight += 0.1;
        } else {
            System.out.println("Nie nakarmisz zdechlego psa");
        }

    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 0.8;
        } else {
            System.out.println("Pies juz nie chodzi");
        }
    }
}
