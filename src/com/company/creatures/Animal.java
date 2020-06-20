package com.company.creatures;

import com.company.Human;
import com.company.sellable;

import java.io.File;

public abstract class Animal implements sellable, Feedable {
    final String species;
    protected Double weight;
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
    public void feed(double foodWeight) {
        if (this.weight > 0) {
            this.weight += foodWeight/2;
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

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet == this) {
            if (buyer.cash >= price) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.printf("Animal %s goscia %s sprzedano za %f kolesiowi %s",
                        this.name, seller.lastName, price, buyer.lastName);
            } else {
                System.out.println("Za malo pieniedzy na zakup");
            }
        } else {
            System.out.println("Ten zwierzak nie nalezy do ciebie.");
        }
    }
}